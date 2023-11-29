x=int(input())
c=0
l=[1,2,3,4,5]
while x>0:
    if x in l:
        x=0
        c+=1
        break
    x-=5
    c+=1
print(c)