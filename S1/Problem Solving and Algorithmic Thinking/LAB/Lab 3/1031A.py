w,h,k=map(int,input().split())
c=0
d=0
while w>=3 and h>=3 and d!=k:
    c+=(2*(w+h)-4)
    w-=4
    h-=4
    d+=1
print(c)