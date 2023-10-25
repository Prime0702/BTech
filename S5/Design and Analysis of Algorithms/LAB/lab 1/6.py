n=int(input("Enter number:"))
i=2
while i<=n**0.5:
    if n%i==0:
        print("Not prime")
        break
    i+=1
else:
    print("Prime")