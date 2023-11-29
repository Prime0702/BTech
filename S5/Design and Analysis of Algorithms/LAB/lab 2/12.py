def firstNNaturalNumbers(n):
    if n == 0:
        return
    print(n, end=" ")
    firstNNaturalNumbers(n - 1)

firstNNaturalNumbers(10)