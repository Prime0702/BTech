l=sorted([int(x) for x in input('Enter values seperated by space: ').split()])
result=[]
for i in l:
    if i not in result:
        result+=[i]
print(result)