def reverseIntegerRecursive(n):
    if n < 10:
        return n
    else:
        return (n % 10) * pow(10, len(str(n)) - 1) + reverseIntegerRecursive(n // 10)
    
    