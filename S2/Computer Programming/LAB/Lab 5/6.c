#include<stdio.h>
int power(int x,int y){return (y--)?x*power(x,y):1;}
int main(){
    int a,b;
    printf("Enter number: ");scanf("%d",&a);
    printf("Enter power: ");scanf("%d",&b);
    printf("%d",power(a,b));
    return 0;
}
