#include<stdio.h>
int sum(int n){return (n==1)?n:n+sum(n-1);}
int main(){
    int x;
    scanf("%d",&x);
    printf("sum from %d till %d is %d",0,x,sum(x));
    return 0;
}
