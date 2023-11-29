n=int(input())
if n>1:
    c=0
    for i in range(2,n+1):
        if n%i==0:
            c+=1
    print(c)