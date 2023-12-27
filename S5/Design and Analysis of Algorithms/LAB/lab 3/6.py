def knapsack(W:float, w:list, val:list, N:int) -> int:
    if N==0 or W==0:
        return 0
    elif w[N-1]>W:
        return knapsack(W,w,val,N-1)
    else:
        return max(val[N-1]+knapsack(W-w[N-1],w,val,N-1),knapsack(W,w,val,N-1))
    
w = [10,20,30]
val = [60,100,120]
W = 50
print(knapsack(W,w,val,len(w)))
    
