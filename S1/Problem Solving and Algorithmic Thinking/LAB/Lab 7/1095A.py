s=input()
c,l=0,0
for i in s:
    if i.isupper():c+=1
    else:l+=1
print(s.upper() if c>l else s.lower())