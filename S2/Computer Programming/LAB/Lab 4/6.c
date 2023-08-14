#include<stdio.h>
long int fact(long int n){
    long int f=1;
    for (long int i=1; i<=n; i++){
        f*=i;
    }
    return f;
}
int main(){
    long int n;
    printf("Enter the number : ");scanf("%ld",&n);
    printf("The factorial of %ld is %ld",n,fact(n));
    return 0;
}
