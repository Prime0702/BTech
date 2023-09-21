s=input()
for i in range(len(s)):
    s+=' '
    if s[i] in 'bcdfghjklmpqrstvwxyz':
        if (s[i+1] not in 'aeiou')or len(s)==2:
            print('NO')
            break
else:print('YES')