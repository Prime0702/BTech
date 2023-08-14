#include<stdio.h>
void prods(int *p, int x){
    int y;
    if (x--){
        scanf("%d",&y);
        *p*=y;
        prods(p,x);
    }
}
int main(){
    int d=1;
    prods(&d,2); //Here 2 indicates the number of times the function is repeated.
    printf("%d",d);
    return 0;
}
