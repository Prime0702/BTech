def sortedMerge(a: list, b: list) -> list:
    c = []
    while a and b:
        if a[0] < b[0]:
            c.append(a.pop(0))
        else:
            c.append(b.pop(0))
    if a:
        c.extend(a)
    elif b:
        c.extend(b)
    return c

a=sorted([int(x) for x in input('Enter values seperated by space: ').split()])
b=sorted([int(x) for x in input('Enter values seperated by space: ').split()])
c=sortedMerge(a,b)
print(c)
