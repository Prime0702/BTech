
def find_median(arr):
    n = len(arr)
    if n <= 5:
        arr.sort()
        return arr[n//2]
    else:
        medians = []
        for i in range(0, n, 5):
            sub_arr = arr[i:i+5]
            medians.append(find_median(sub_arr))
        pivot = find_median(medians)
        left = [x for x in arr if x < pivot]
        right = [x for x in arr if x > pivot]
        k = len(left)
        if n//2 == k:
            return pivot
        elif n//2 < k:
            return find_median(left)
        else:
            return find_median(right)

