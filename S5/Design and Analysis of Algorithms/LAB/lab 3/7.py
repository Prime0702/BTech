def minimize_sum(arr):
    n = len(arr)
    dp = [[0] * n for _ in range(n)]

    for gap in range(2, n + 1):
        for i in range(n - gap + 1):
            j = i + gap - 1
            dp[i][j] = float('inf')
            for k in range(i, j):
                dp[i][j] = min(dp[i][j], dp[i][k] + dp[k + 1][j] + (arr[i] + arr[k + 1]) % 100)

    return dp[0][n - 1]

arr = [40, 60, 20]
result = minimize_sum(arr)
print(result)
