#include<stdio.h>
int bin(int n){return (n==0)?0:((n%2)+10*bin(n/2));}
int main(){
    int n;
    scanf("%d",&n);
    printf("%d",bin(n));
    return 0;
}
