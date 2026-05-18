# ============================================================
# Python String Operations - Comprehensive Reference
# ============================================================

s = "Hello, World!"

# ─────────────────────────────────────────────
# 1. CREATION
# ─────────────────────────────────────────────
s1 = "double quotes"
s2 = 'single quotes'
s3 = """multi
line"""
s4 = '''also
multi'''
s5 = str(42)           # from int   → '42'
s6 = str(3.14)         # from float → '3.14'

# ─────────────────────────────────────────────
# 2. ACCESSING CHARACTERS & SLICING
# ─────────────────────────────────────────────
s = "Hello, World!"

first   = s[0]          # 'H'
last    = s[-1]         # '!'
substr  = s[7:12]       # 'World'
rev     = s[::-1]       # '!dlroW ,olleH'
step    = s[::2]        # 'Hlo ol!'
every2  = s[1::2]       # 'el,Wrd'

# ─────────────────────────────────────────────
# 3. BASIC PROPERTIES
# ─────────────────────────────────────────────
length  = len(s)        # 13
empty   = len("") == 0  # True

# ─────────────────────────────────────────────
# 4. CASE CONVERSION
# ─────────────────────────────────────────────
s = "hello world"

upper   = s.upper()         # 'HELLO WORLD'
lower   = s.lower()         # 'hello world'
title   = s.title()         # 'Hello World'
cap     = s.capitalize()    # 'Hello world'
swap    = s.swapcase()      # 'HELLO WORLD'
fold    = s.casefold()      # 'hello world'  (aggressive lowercase, e.g. 'ß' → 'ss')

# ─────────────────────────────────────────────
# 5. SEARCHING & COUNTING
# ─────────────────────────────────────────────
s = "banana"

idx1    = s.find("an")         # 1   (-1 if not found)
idx2    = s.rfind("an")        # 3
idx3    = s.index("an")        # 1   (raises ValueError if not found)
idx4    = s.rindex("an")       # 3
cnt     = s.count("an")        # 2
cnt2    = s.count("a", 2, 6)   # 2   (search within [2,6))

# ─────────────────────────────────────────────
# 6. PREFIX / SUFFIX CHECKS
# ─────────────────────────────────────────────
s = "Hello, World!"

sw_h    = s.startswith("Hello")         # True
sw_hi   = s.startswith(("Hi", "Hello")) # True  (tuple of options)
ew_exc  = s.endswith("!")               # True
ew_tup  = s.endswith((".", "!"))        # True

# ─────────────────────────────────────────────
# 7. MEMBERSHIP TEST
# ─────────────────────────────────────────────
s = "Hello, World!"

in_test  = "World" in s     # True
not_in   = "Python" not in s# True

# ─────────────────────────────────────────────
# 8. TRIMMING / STRIPPING
# ─────────────────────────────────────────────
s = "   hello   "

stripped  = s.strip()          # 'hello'
l_strip   = s.lstrip()         # 'hello   '
r_strip   = s.rstrip()         # '   hello'
custom    = "##hello##".strip("#")  # 'hello'

# ─────────────────────────────────────────────
# 9. REPLACING
# ─────────────────────────────────────────────
s = "aabbaa"

rep1 = s.replace("a", "x")        # 'xxbbxx'
rep2 = s.replace("a", "x", 2)     # 'xxbbaa'  (max 2 replacements)

# ─────────────────────────────────────────────
# 10. SPLITTING & JOINING
# ─────────────────────────────────────────────
s = "one,two,three"

parts    = s.split(",")           # ['one', 'two', 'three']
parts2   = s.split(",", 1)        # ['one', 'two,three']
lines    = "a\nb\nc".splitlines() # ['a', 'b', 'c']
words    = "  hello   world  ".split()  # ['hello', 'world']  (whitespace split)

joined   = ",".join(["a", "b", "c"])   # 'a,b,c'
joined2  = " ".join(["Hello", "World"])# 'Hello World'

# ─────────────────────────────────────────────
# 11. PADDING & ALIGNMENT
# ─────────────────────────────────────────────
s = "hi"

ljust  = s.ljust(10)          # 'hi        '
rjust  = s.rjust(10)          # '        hi'
center = s.center(10)         # '    hi    '
ljust2 = s.ljust(10, "-")     # 'hi--------'
center2= s.center(10, "*")    # '****hi****'
zfill  = "42".zfill(5)        # '00042'

# ─────────────────────────────────────────────
# 12. STRING FORMATTING
# ─────────────────────────────────────────────
name, age = "Alice", 30

# %-style (old)
old_fmt  = "Name: %s, Age: %d" % (name, age)

# str.format()
fmt1     = "Name: {}, Age: {}".format(name, age)
fmt2     = "Name: {name}, Age: {age}".format(name=name, age=age)
fmt3     = "{0!r} has {1:>10} items".format("box", 42)

# f-strings (Python 3.6+)
f1       = f"Name: {name}, Age: {age}"
f2       = f"{age:05d}"           # '00030'
f3       = f"{3.14159:.2f}"       # '3.14'
f4       = f"{'hello':^10}"       # '  hello   '
f5       = f"{name!r}"            # "'Alice'"
f6       = f"{2**10 = }"          # "2**10 = 1024" (debug, 3.8+)

# Template strings
from string import Template
t        = Template("Hello, $name!")
t_out    = t.substitute(name="Bob")    # 'Hello, Bob!'
t_safe   = t.safe_substitute()         # 'Hello, $name!'  (no error on missing key)

# ─────────────────────────────────────────────
# 13. ENCODING & BYTES
# ─────────────────────────────────────────────
s = "hello"

encoded  = s.encode("utf-8")           # b'hello'
decoded  = encoded.decode("utf-8")     # 'hello'
encoded2 = s.encode("ascii")           # b'hello'

# ─────────────────────────────────────────────
# 14. CHARACTER CLASSIFICATION
# ─────────────────────────────────────────────
tests = {
    "isalpha":    "Hello".isalpha(),        # True
    "isdigit":    "123".isdigit(),          # True
    "isnumeric":  "½".isnumeric(),          # True  (fractions, etc.)
    "isdecimal":  "123".isdecimal(),        # True  (only 0–9)
    "isalnum":    "Hello123".isalnum(),     # True
    "isspace":    "   ".isspace(),          # True
    "islower":    "hello".islower(),        # True
    "isupper":    "HELLO".isupper(),        # True
    "istitle":    "Hello World".istitle(),  # True
    "isidentifier": "my_var".isidentifier(),# True
    "isprintable": "hello\n".isprintable(), # False
    "isascii":    "hello".isascii(),        # True
}

# ─────────────────────────────────────────────
# 15. TRANSLATION TABLE (translate / maketrans)
# ─────────────────────────────────────────────
table   = str.maketrans("aeiou", "AEIOU")
result  = "hello world".translate(table)    # 'hEllO wOrld'

# delete chars
del_tbl = str.maketrans("", "", "aeiou")
no_vowel= "hello world".translate(del_tbl)  # 'hll wrld'

# ─────────────────────────────────────────────
# 16. CONCATENATION & REPETITION
# ─────────────────────────────────────────────
a, b = "Hello", " World"

concat = a + b           # 'Hello World'
repeat = "ha" * 3        # 'hahaha'
aug    = a; aug += "!"   # 'Hello!'

# ─────────────────────────────────────────────
# 17. COMPARISON
# ─────────────────────────────────────────────
eq   = ("abc" == "abc")  # True
lt   = ("abc" < "abd")   # True  (lexicographic)
gt   = ("z" > "a")       # True

# ─────────────────────────────────────────────
# 18. ITERATION
# ─────────────────────────────────────────────
for ch in "abc":
    pass                  # ch → 'a', 'b', 'c'

chars = list("abc")       # ['a', 'b', 'c']

for i, ch in enumerate("abc"):
    pass                  # i=0 ch='a', i=1 ch='b', ...

# ─────────────────────────────────────────────
# 19. CONVERSION HELPERS
# ─────────────────────────────────────────────
ord_a   = ord("A")       # 65
chr_65  = chr(65)        # 'A'
bin_str = bin(10)[2:]    # '1010'
hex_str = hex(255)[2:]   # 'ff'
oct_str = oct(8)[2:]     # '10'
int_bin = int("1010", 2) # 10
int_hex = int("ff", 16)  # 255

# ─────────────────────────────────────────────
# 20. USEFUL STDLIB HELPERS
# ─────────────────────────────────────────────
import re

# re.sub  — regex replace
result1 = re.sub(r"\d+", "#", "a1b22c333")   # 'a#b#c#'

# re.findall — extract all matches
result2 = re.findall(r"\d+", "a1 b22 c333")  # ['1', '22', '333']

# re.split — split by pattern
result3 = re.split(r"[,;]+", "a,b;;c")       # ['a', 'b', 'c']

# re.match / re.search
m = re.search(r"(\w+)@(\w+)", "user@host")
if m:
    full  = m.group(0)  # 'user@host'
    user  = m.group(1)  # 'user'
    host  = m.group(2)  # 'host'

# textwrap
import textwrap
wrapped = textwrap.wrap("long text here " * 5, width=30)
dedented= textwrap.dedent("""
    hello
    world
""").strip()

# difflib — similarity
import difflib
ratio = difflib.SequenceMatcher(None, "kitten", "sitting").ratio()  # 0.615...

# ─────────────────────────────────────────────
# 21. IMMUTABILITY NOTE
# ─────────────────────────────────────────────
# Strings are immutable; every operation returns a NEW string.
s     = "hello"
new_s = s.upper()   # s is still 'hello', new_s is 'HELLO'

# Efficient building of many strings → use a list then join
parts = []
for i in range(5):
    parts.append(str(i))
result = "".join(parts)   # '01234'  (much faster than += in a loop)

# ─────────────────────────────────────────────
# 22. QUICK DEMO
# ─────────────────────────────────────────────
if __name__ == "__main__":
    demo = "  Python String Ops  "
    print(demo.strip().upper())             # PYTHON STRING OPS
    print(demo.strip().replace(" ", "_"))   # Python_String_Ops
    print("|".join(demo.strip().split()))   # Python|String|Ops
    words_sorted = sorted(demo.strip().split(), key=str.lower)
    print(words_sorted)                     # ['Ops', 'Python', 'String']
    print(f"Length: {len(demo.strip())}")   # Length: 17
