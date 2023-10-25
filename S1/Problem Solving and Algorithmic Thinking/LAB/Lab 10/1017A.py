n=int(input())
l=[int(x) for x in input().split()]
s=sum(l)
rank=1
if n!=1:
    for i in range(n-1):
        l=[int(x) for x in input().split()]
        if s<sum(l):rank+=1
print(rank)