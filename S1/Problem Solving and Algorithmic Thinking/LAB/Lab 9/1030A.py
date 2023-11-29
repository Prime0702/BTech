n=int(input())
l=list(map(int,input().split()))[:n]
print('EASY' if 1 not in l else 'HARD')