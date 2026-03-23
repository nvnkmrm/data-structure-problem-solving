

import pytest


def recursion(i):
    print(i)
    recursion(i + 1)
    return


@pytest.mark.parametrize("start", [1, 5, 100])
def test_recursion_raises_recursion_error(start):
    with pytest.raises(RecursionError):
        recursion(start)


if __name__ == '__main__':
    recursion(1)