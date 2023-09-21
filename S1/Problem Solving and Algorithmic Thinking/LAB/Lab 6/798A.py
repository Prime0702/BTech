s=input()
l=0
for _ in range(len(s)//2):
    if s[_]!=s[len(s)-1-_]:
        l+=1
if (len(s)%2==0 and l==0) or l>1:
    print("NO")
else:
    print("YES")