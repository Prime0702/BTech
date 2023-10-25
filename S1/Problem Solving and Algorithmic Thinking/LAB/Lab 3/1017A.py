n=int(input())
a,b,c,d=map(int,input().split())
s=a+b+c+d
rank=1
if n!=1:
    for i in range(n-1):
        a,b,c,d=map(int,input().split())
        if s<a+b+c+d :rank+=1
print(rank)