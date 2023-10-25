#include<stdio.h>
int m;
void digits(int n){
    if (n){
        m=n%10;
        printf("%d\n",m);
        digits(n/10);
    }
}
int main(){
    int x;
    scanf("%d",&x);
    digits(x);
    return 0;
}
