def pow(a,b):
    if b==0:
        return 1
    else:
        return a*pow(a,b-1)
    
    