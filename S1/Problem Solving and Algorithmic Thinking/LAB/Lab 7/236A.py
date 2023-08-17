s=input()
l=[]
for i in s: 
    if i not in l:l.append(i)
print("CHAT WITH HER!" if len(l)%2==0 else "IGNORE HIM!")