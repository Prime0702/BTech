n,s=map(int,input().split())
print(s//n+(1 if s%n>0 else 0))