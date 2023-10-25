def binarySearch(arr, l, r, x):
    if r >= l:
        mid = l + (r - l) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearch(arr, l, mid - 1, x)
        else:
            return binarySearch(arr, mid + 1, r, x)
    else:
        return -1

def binarySearchIterative(arr, l, r, x):
    while l <= r:
        mid = l + (r - l) // 2;
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            l = mid + 1
        else:
            r = mid - 1
    return -1

l=sorted([int(x) for x in input('Enter values seperated by space: ').split()])
print("Sorted list is: ",*l)
k=int(input('Enter the value to be searched: '))
result = binarySearch(l, 0, len(l)-1, k)
if result != -1:
    print("Element is present at index", str(result))
else:
    print("Element is not present in array")
