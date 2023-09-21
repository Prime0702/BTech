//Write a C program to reverse a 5-digit integer.
#include<stdio.h>
int main(){
    int n,rev=0;
    printf("Enter a 5-digit integer: ");
    scanf("%d",&n);
    while(n!=0){
        rev=rev*10+n%10;
        n/=10;
    }
    printf("Reversed number: %d\n",rev);
    return 0;
}