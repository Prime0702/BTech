/*@
    requires num > 0;
    ensures \result == num*(num+1)*(2*num+1)/6;
*/
int try(int num){
    int s=0;
    int i=1;
    /*@
        loop invariant s == i*(i+1)*(2*i+1)/6-i*i;
        loop invariant 1 <= i <= num+1;
        loop assigns s, i;
        loop variant num-i;
    */
    while (i <= num){
        s = s + i*i;
        i = i + 1;
    }
    return s;
}