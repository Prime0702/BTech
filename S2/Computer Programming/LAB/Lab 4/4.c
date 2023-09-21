#include<stdio.h>
int sum(int a){return(a*(a+1)/2);}
int main(){
    int n;
    printf("Enter the limit : ");scanf("%d",&n);
    printf("Sum of natural numbers till %d is %d.",n,sum(n));
    return 0;
}
