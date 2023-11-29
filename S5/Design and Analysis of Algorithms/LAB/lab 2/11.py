def firstNNaturalNumbers(n):
    if n == 0:
        return
    firstNNaturalNumbers(n - 1)
    print(n, end=" ")

firstNNaturalNumbers(10)