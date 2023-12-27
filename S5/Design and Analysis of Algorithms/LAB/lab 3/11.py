def count_ways(score):
    # Create a list to store the number of ways to reach each score
    ways = [0] * (score + 1)

    # Base cases
    ways[0] = 1

    # Iterate through all possible scores
    for i in range(3, score + 1):
        ways[i] += ways[i - 3]
    for i in range(5, score + 1):
        ways[i] += ways[i - 5]
    for i in range(10, score + 1):
        ways[i] += ways[i - 10]

    return ways[score]

# Test the function
score = 15
num_ways = count_ways(score)
print(f"The number of ways to reach a score of {score} is {num_ways}.")
