
import pytest


def fibonacci_number(n):
    if n <= 1:
        return n

    return fibonacci_number(n - 1) + fibonacci_number(n - 2)


@pytest.mark.parametrize("n, expected", [
    (0, 0),
    (1, 1),
    (2, 1),
    (3, 2),
    (4, 3),
    (5, 5),
    (10, 55),
])
def test_fibonacci_number(n, expected):
    assert fibonacci_number(n) == expected


if __name__ == '__main__':
    print(fibonacci_number(1))
    print(fibonacci_number(2))
    print(fibonacci_number(3))
    print(fibonacci_number(4))
    print(fibonacci_number(5))