

def recursion(i):
    print(i)
    recursion(i + 1)
    return

if __name__ == '__main__':
    recursion(1)