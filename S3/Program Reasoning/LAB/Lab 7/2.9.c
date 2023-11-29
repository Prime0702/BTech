int sigma(int n){
    int s=0;int i=n;
    /*@
        loop invariant s == (n-i)*(n-i+1)/2;
        loop invariant 0 <= i <= n+1;
        loop assigns s, i;
    */
    while (i >= 1){
        s = s + i;
        i = i - 1;
    }
    return s;
}