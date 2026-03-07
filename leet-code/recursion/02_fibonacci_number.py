
def fibonacci_number(n):
    if n <= 1:
        return n

    return fibonacci_number(n - 1) + fibonacci_number(n - 2)

if __name__ == '__main__':
    print(fibonacci_number(1))
    print(fibonacci_number(2))
    print(fibonacci_number(3))
    print(fibonacci_number(4))
    print(fibonacci_number(5))