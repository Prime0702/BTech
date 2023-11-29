l=[int(x) for x in input('Enter values seperated by space: ').split()]
k=int(input('Enter the value to be searched: '))
i=0
while i<len(l):
    if l[i]==k:
        print('Value found at index: ',i)
        break
    i+=1
else:
    print('Value not found')
    