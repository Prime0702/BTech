def isSortedRecursive(arr):
    if len(arr) == 0 or len(arr) == 1:
        return True
    if arr[0] > arr[1]:
        return False
    return isSortedRecursive(arr[1:])