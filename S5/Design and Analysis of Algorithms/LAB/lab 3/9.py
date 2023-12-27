def lcs(s1:str, s2:str):
    m = len(s1)
    n = len(s2)
    c = [[0 for _ in range(n+1)] for _ in range(m+1)]
    b = [[0 for _ in range(n+1)] for _ in range(m+1)]
    for i in range(1,m+1):
        for j in range(1,n+1):
            if s1[i-1]==s2[j-1]:
                c[i][j] = c[i-1][j-1]+1
                b[i][j] = 'd'
            elif c[i-1][j]>=c[i][j-1]:
                c[i][j] = c[i-1][j]
                b[i][j] = 'u'
            else:
                c[i][j] = c[i][j-1]
                b[i][j] = 'l'
    return b

def print_lcs(b,s1,i,j):
    if i==0 or j==0:
        return
    if b[i][j]=='d':
        print_lcs(b,s1,i-1,j-1)
        print(s1[i-1],end='')
    elif b[i][j]=='u':
        print_lcs(b,s1,i-1,j)
    else:
        print_lcs(b,s1,i,j-1)

s1 = input()
s2 = s1[::-1]
b = lcs(s1,s2)
print_lcs(b,s1,len(s1),len(s2))
