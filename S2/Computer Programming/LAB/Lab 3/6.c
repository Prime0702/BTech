// Write a program to calculate the pow (x, y), i.e., x y using a loop. Don’t use the pow function of the math header file.
#include<stdio.h>
int main(){
    int x,y,pow=1;
    printf("Enter x and y: ");
    scanf("%d%d",&x,&y);
    for(int i=1;i<=y;i++){
        pow*=x;
    }
    printf("%d^%d: %d\n",x,y,pow);
    return 0;
}