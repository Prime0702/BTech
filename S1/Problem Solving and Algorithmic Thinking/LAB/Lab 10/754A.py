n=int(input())
l=[int(x) for x in input().split()]
if sum(l)!=0:
    print('YES')
    print(1)
    print(1,n)
elif l==[0]*n:print('NO')
else:
    for i in range(n):
        if l[i]!=0:
            break
    print('YES')
    print(2)
    print(1,i+1)
    print(i+2,n)