#include <stdio.h>
void swap(int *x,int *y){int c=*x;*x=*y;*y=c;}
int max(int x,int y, int z){
    if (x>y) return (x>z)?x:z;
    else return (y>z)?y:z;
}
int min(int x,int y,int z){
    if (x<y) return (x<z)?x:z;
    else return (y<z)?y:z;
}
int mid(int a,int b,int c){return a+b+c-max(a,b,c)-min(a,b,c);}
int main(){
    int a,b,c;
    printf("Enter 1st Number: ");scanf("%d",&a);
    printf("Enter 2nd Number: ");scanf("%d",&b);
    printf("\nBefore Swapping:\na = %d\nb = %d",a,b);
    swap(&a,&b);
    printf("\nAfter Swapping:\na = %d\nb = %d\n",a,b);
    printf("Enter 1st Number: ");scanf("%d",&a);
    printf("Enter 2nd Number: ");scanf("%d",&b);
    printf("Enter 3rd Number: ");scanf("%d",&c);
    printf("Second largest number is %d",mid(a,b,c));
    return 0;
}
