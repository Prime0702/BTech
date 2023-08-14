#include<stdio.h>
int main(){
    int a,b=0;
    printf("Enter a five digit number: ");
    scanf("%d",&a);
    while (a>0) {
        b=b*10;
        b= b + a%10;
        a=a/10;
    }
    printf("Sum of the digits is %d\n",b);
    return 0;
}