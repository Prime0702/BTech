//@ ensures \result == n;
int fun(int n){
    n++;
    n--;
    return n;
}