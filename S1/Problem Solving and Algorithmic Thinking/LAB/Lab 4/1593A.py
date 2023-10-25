t=int(input())
for z in range(t):
    a,b,c=map(int,input().split())
    m=max(a,b,c)
    l=[m-a,m-b,m-c]
    for j in range(3):
        if l[j]!=0:l[j]+=1
    if l.count(0)>1:
        for i in range(3):
            if l[i]==0:l[i]+=1
    print(l[0],l[1],l[2])