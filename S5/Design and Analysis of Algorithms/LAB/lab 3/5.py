def coinChange(coins, amount):
    dom=sorted(coins)
    c=0
    for i in range(len(dom)-1,-1,-1):
        if amount>=dom[i]:
            c+=amount//dom[i]
            amount%=dom[i]
    if amount!=0:
        return -1
    return c

coins=[1,2,5,10]
amount=57
print(coinChange(coins,amount))
