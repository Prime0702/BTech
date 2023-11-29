/*@
    requires 1<=n<=3;
    ensures \result == n*(n+1)/2;
*/
int sigma(int n){
    int i=1,s=0;
    while (i<=n){
        s = s + i;
        i = i + 1;
    }
    return s;
}