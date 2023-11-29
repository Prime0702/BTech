def gcdIterative(a, b):
    while b:
        a, b = b, a%b
    return a

a,b = map(int,input("Enter two numbers: ").split())
print("GCD of {} and {} is {}".format(a,b,gcdIterative(a,b)))
