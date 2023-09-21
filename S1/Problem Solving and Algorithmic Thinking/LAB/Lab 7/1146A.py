s=input()
l=[]
for i in s:l.append(i)
print(len(s) if l.count('a')>len(l)-l.count('a') else (l.count('a')*2-1))