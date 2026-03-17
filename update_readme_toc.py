#!/usr/bin/env python3
"""
update_readme_toc.py — Scans every *.md file in the notes/ directory and
regenerates the "## Table of Contents" section in README.md.

How it works:
  • Each note file is expected to have an internal TOC block followed by a
    '---' separator, then the actual content.
  • The first H1 (# Heading) after the separator becomes the top-level link.
  • Every H2 (## Heading) after the separator becomes an indented sub-link.
  • Note files are processed in sorted (alphabetical/numeric) order.

Usage:
    python update_readme_toc.py          # run from workspace root
"""

import glob
import os
import re

NOTES_DIR = "notes"
README = "README.md"
TOC_HEADING = "## Table of Contents"


# ---------------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------------

def heading_to_anchor(text: str) -> str:
    """Convert a Markdown heading to a GitHub-style anchor fragment."""
    # strip inline links:  [label](url) → label
    text = re.sub(r"\[([^\]]+)\]\([^)]+\)", r"\1", text)
    # strip bold / italic / code markers
    text = re.sub(r"[`*_]", "", text)
    # drop non-ASCII (e.g. emoji)
    text = text.encode("ascii", "ignore").decode()
    text = text.lower()
    # remove everything that is not alphanumeric, whitespace, or hyphen
    text = re.sub(r"[^\w\s-]", "", text)
    # collapse whitespace/underscores to a single hyphen
    text = re.sub(r"[\s_]+", "-", text).strip("-")
    return text


def extract_headings(filepath: str) -> tuple[str | None, list[str]]:
    """
    Return (topic_title, [sub_topic_title, ...]) from a note file.

    The function skips the internal "# Table of Contents … ---" block that
    lives at the top of each note.  Everything after the first '---' separator
    is considered real content.

    If no separator is found the whole file is treated as content (graceful
    fallback for notes that do not have an internal TOC yet).
    """
    with open(filepath, encoding="utf-8") as fh:
        raw_lines = [line.rstrip("\n") for line in fh]

    # Determine where content starts (after the first '---' separator).
    content_start = 0
    for idx, line in enumerate(raw_lines):
        if line.strip() == "---":
            content_start = idx + 1
            break

    topic: str | None = None
    sub_topics: list[str] = []

    for line in raw_lines[content_start:]:
        m1 = re.match(r"^#\s+(.*)", line)
        if m1:
            if topic is None:          # take only the first H1
                topic = m1.group(1).strip()
            continue
        m2 = re.match(r"^##\s+(.*)", line)
        if m2:
            sub_topics.append(m2.group(1).strip())

    return topic, sub_topics


# ---------------------------------------------------------------------------
# TOC builder
# ---------------------------------------------------------------------------

def build_toc_lines() -> list[str]:
    """Scan notes/*.md and return the new TOC lines for README.md."""
    note_files = sorted(glob.glob(os.path.join(NOTES_DIR, "*.md")))
    toc: list[str] = []

    for filepath in note_files:
        rel_path = filepath.replace(os.sep, "/")   # always forward slashes
        topic, sub_topics = extract_headings(filepath)

        if topic is None:
            print(f"  SKIP {rel_path}: no H1 heading found after content separator")
            continue

        toc.append(f"- [{topic}]({rel_path})")
        for sub in sub_topics:
            anchor = heading_to_anchor(sub)
            toc.append(f"  - [{sub}]({rel_path}#{anchor})")

    return toc


# ---------------------------------------------------------------------------
# README updater
# ---------------------------------------------------------------------------

def update_readme(path: str) -> None:
    with open(path, encoding="utf-8") as fh:
        original = fh.read()

    lines = original.splitlines()

    # Locate the "## Table of Contents" heading
    toc_idx = next(
        (i for i, line in enumerate(lines) if line.strip() == TOC_HEADING),
        None,
    )
    if toc_idx is None:
        print(f"ERROR: '{TOC_HEADING}' heading not found in {path}.")
        return

    # Find the end of the existing TOC block.
    # A new heading (# or ##) or a '---' separator marks the end.
    # If neither is found the TOC extends to the end of the file.
    toc_end_idx = len(lines)
    for i in range(toc_idx + 1, len(lines)):
        stripped = lines[i].strip()
        if stripped.startswith("#") or stripped == "---":
            toc_end_idx = i
            break

    new_toc = build_toc_lines()

    new_lines = (
        lines[: toc_idx + 1]    # keep the "## Table of Contents" heading
        + [""]                   # blank line after heading
        + new_toc                # generated entries
        + lines[toc_end_idx:]    # everything after the old TOC (may be empty)
    )

    new_content = "\n".join(new_lines) + "\n"

    if new_content == original:
        print("README.md is already up to date — nothing changed.")
        return

    with open(path, "w", encoding="utf-8") as fh:
        fh.write(new_content)

    print(f"README.md updated — TOC now has {len(new_toc)} entries.")


# ---------------------------------------------------------------------------
# Entry point
# ---------------------------------------------------------------------------

if __name__ == "__main__":
    update_readme(README)
