/*@
    behavior p:
        assumes a>0;
        ensures \result == a+1;
    behavior n:
        assumes a<=0;
        ensures \result == a+2;
    complete behaviors p, n;
    disjoint behaviors p, n;
*/
int fun(int a){
    if (a>0){
        a=a+1;
    }else{
        a=a+2;
    }
    return a;
}