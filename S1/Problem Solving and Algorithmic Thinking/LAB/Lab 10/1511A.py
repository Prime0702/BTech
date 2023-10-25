for _ in range(int(input())):
    n=int(input())
    r=list(map(int,input().split()))
    print(n-(r.count(2)))