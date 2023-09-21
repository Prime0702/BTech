n=int(input())
s=input()[:n]
c,i=0,0
while i<n-1:
    if s[i]!=s[i+1]:
        c+=1
        i+=1
    i+=1
print(n-c)