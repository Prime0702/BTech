a,b,c=map(int,input().split())
z=[a,b,c]
z.sort()
if z[0]+z[1]>z[2]:print(0)
else:print(z[2]+1-z[0]-z[1])