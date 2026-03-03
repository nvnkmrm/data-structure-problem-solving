def recursive_fn(i):
    print(i)
    recursive_fn(i + 1)
    return


if __name__ == '__main__':
    recursive_fn(1)
