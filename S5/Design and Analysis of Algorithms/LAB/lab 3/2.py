def max_subarray_sum(arr, k):
    n = len(arr)
    max_sum = float('-inf')
    current_sum = 0

    for _ in range(k):
        for i in range(n):
            current_sum = max(arr[i], current_sum + arr[i])
            max_sum = max(max_sum, current_sum)

    return max_sum

arr = [5,3 , -2,1,6,7]
print(max_subarray_sum(arr, 2))