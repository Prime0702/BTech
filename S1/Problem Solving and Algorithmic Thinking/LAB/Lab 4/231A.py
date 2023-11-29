n=int(input())
got=0
for i in range(n):
    a,b,c=map(int,input().split())
    l=[a,b,c]
    if l.count(1)>1:
        got+=1
print(got)