l=sorted([int(x) for x in input('Enter values seperated by space: ').split()])
print("Sorted list is: ",*l)
x=sorted(list(set(l)))
if(len (x)>2):
    print('Element niether minimum nor maximum: ',x[1])
else:
    print("Not enough elements in the list.")