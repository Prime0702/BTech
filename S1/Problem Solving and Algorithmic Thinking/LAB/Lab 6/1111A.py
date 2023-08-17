s,t=input(),input()
ls,lt=len(s),len(t)
v='aeiou'
try:
    for i in range(ls):
        if lt!=ls:
            print('No')
            break
        if (s[i] in v and t[i] in v) or (s[i] not in v and t[i] not in v):
            f='Yes'
        else:
            f='No'
            break
    print(f)
except:
    pass