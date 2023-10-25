t,k=map(int,input().split())
r=''
for i in range(k+1):
    r+=str(i)
c=0
 
for _ in range(t):
    d=0
    n=input()
    for i in r:
        if i in n:
            d+=1
    if d==k+1:
        c+=1
print(c)