/*@
    requires n == 3;
    ensures \result == n*(n+1)/2;
*/
int sigma(int n){
    int s = 0, i = 1;
    s = s + i; i = i + 1;
    s = s + i; i = i + 1;
    s = s + i;
    return s;
}