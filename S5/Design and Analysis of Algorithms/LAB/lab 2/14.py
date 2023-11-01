def printElements(arr):
    if len(arr) == 0:
        print()
        return
    print(arr[0], end=" ")
    printElements(arr[1:])
    
printElements([1, 2, 3, 4, 5])