def kth_largest(arr, k):
    if k<0 or k>len(arr):
        return None
    mx,mn=arr[0],arr[0]
    for i in arr:
        if i>mx:
            mx=i
        if i<mn:
            mn=i
    if k==1:
        return mx
    if k==len(arr):
        return mn
    arr.pop(arr.index(mx))
    arr.append(mx)
    return kth_largest(arr[:-1],k-1)
        
print(kth_largest([1, 2, 3, 4, 5, 6, 7, 8, 9], 3))