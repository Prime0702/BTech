l=[]
for i in range(int(input('Enter the number of elements: '))):
    x=int(input("x"+str(i+1)+": "))
    y=int(input("y"+str(i+1)+": "))
    l.append((x,y))
x1,y1=l[0]
x2,y2=l[1]
slope=(y2-y1)/(x2-x1)
for i in range(2,len(l)):
    x1,y1=l[i-1]
    x2,y2=l[i]
    if slope!=(y2-y1)/(x2-x1):
        print('False')
        break
else:
    print('True')
