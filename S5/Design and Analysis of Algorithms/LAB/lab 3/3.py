def maximize_subset_difference(arr, K):
    arr.sort()
    sum_subset1 = sum(arr[:K])
    sum_subset2 = sum(arr[K:])
    difference = sum_subset2 - sum_subset1
    return difference

arr = [1, 5, 3, 2, 4]
K = 2
difference = maximize_subset_difference(arr, K)
print("Maximum difference:", difference)
