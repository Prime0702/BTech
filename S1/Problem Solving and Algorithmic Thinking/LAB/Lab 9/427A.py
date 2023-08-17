n=int(input())
l=[int(i) for i in input().split()]
l=l[:n]
s=0
c=0
for i in l:
    s+=i
    if s<0:
        c+=1
        s=0
print(c)