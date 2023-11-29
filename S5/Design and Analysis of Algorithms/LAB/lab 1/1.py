l=[int(x) for x in input('Enter values seperated by space: ').split()]
if len(l)!=0:
    m=l[0]
    for i in l:
        if i<m:
            m=i
    print('Minimum value is: ',m)