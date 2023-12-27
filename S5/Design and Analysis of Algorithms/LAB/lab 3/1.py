def max_sum_subarray(arr:list,low:int,high:int)->tuple:
    if low==high:
        return(low,high,arr[low])
    else:
        mid = (low+high)//2
        left_low, left_high, left_sum = max_sum_subarray(arr,low,mid)
        right_low, right_high, right_sum = max_sum_subarray(arr,mid+1,high)
        cross_low, cross_high, cross_sum = cross_subarray_sum(arr,low,mid,high)
        if left_sum>=right_sum and left_sum>=cross_sum:
            return(left_low, left_high, left_sum)
        elif right_sum>=left_sum and right_sum>=cross_sum:
            return(right_low, right_high, right_sum)
        else:
            return(cross_low, cross_high, cross_sum)

def  cross_subarray_sum(arr:list, low:int, mid:int, high:int)->tuple:
    left_sum = -(float('inf'))
    sum = 0
    for i in range(mid,low-1,-1):
        sum += arr[i]
        if sum>left_sum:
            left_sum = sum
            max_left = i
    right_sum = -(float('inf'))
    sum = 0
    for j in range(mid+1,high+1):
        sum += arr[j]
        if sum>right_sum:
            right_sum = sum
            max_right = j
    return(max_left,max_right,left_sum+right_sum)

arr = [5,3 , -2,1,6,7]
print(max_sum_subarray(arr,0,len(arr)-1))