n=int(input())
l=list(map(int,input().split()))
l=l[:n]
m=[]
for i in range(n-1):
    if l[i]<l[i+1]:m.append(1)
    elif l[i]==l[i+1]:m.append(0)
    else:m.append(-1)
a=True
for i in range(len(m)-1):
    if m[i]==-1 and (m[i+1]==1 or m[i+1]==0):
        a=False
    elif m[i]==0 and m[i+1]==1:
        a=False
print('YES' if a else 'NO')