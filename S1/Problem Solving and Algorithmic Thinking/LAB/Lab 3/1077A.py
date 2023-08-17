t=int(input())
for z in range(t):
    a,b,k=map(int,input().split())
    print((a - b) * (k // 2) + a * (k%2))