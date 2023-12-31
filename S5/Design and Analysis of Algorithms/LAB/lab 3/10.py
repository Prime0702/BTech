def longest_increasing_subsequence(nums):
    n = len(nums)
    dp = [1] * n

    for i in range(1, n):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j] + 1)

    max_length = max(dp)
    lis = []
    idx = dp.index(max_length)

    for i in range(idx, -1, -1):
        if dp[i] == max_length:
            lis.append(nums[i])
            max_length -= 1

    lis.reverse()
    return lis

l = [int(x) for x in input().split()]
print(longest_increasing_subsequence(l))
