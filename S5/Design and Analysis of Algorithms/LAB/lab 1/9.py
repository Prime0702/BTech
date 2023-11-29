l=[int(x) for x in input('Enter values seperated by space: ').split()]
low=[]
high=[]
for i in l[1:]:
    if i<l[0]:
        low += [i]
    elif i>l[0]:
        high += [i]
print("Low = ", *low)
print("High= ", *high)
