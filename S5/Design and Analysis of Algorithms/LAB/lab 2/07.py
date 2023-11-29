def sumOfFirstN(n):
    return (n + sumOfFirstN(n-1)) if n else 0

print(sumOfFirstN(10))