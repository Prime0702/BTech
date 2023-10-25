/*@
    requires n > 0;
    ensures \result == n*(n+1)/2;
*/
int a(int n){
    int s=0;
    int i=1;
    /*@
        loop invariant s == i*(i-1)/2;
        loop invariant 1 <= i <= n;
        loop assigns s, i;
    */
    while (i <= n){
        s = s + i;
        i = i + 1;
    }
    return s;
}