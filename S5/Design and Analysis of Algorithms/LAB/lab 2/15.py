def printElements(arr):
    if len(arr) == 0:
        return
    printElements(arr[1:])
    print(arr[0], end=" ")
    
printElements([1, 2, 3, 4, 5])