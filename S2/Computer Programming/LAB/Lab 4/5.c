#include<stdio.h>
int max(int x,int y, int z){
    if (x>y) return (x>z)?x:z;
    else return (y>z)?y:z;
}
int main(){
    int a,b,c;
    printf("Enter 3 numbers : ");scanf("%d %d %d", &a,&b,&c);
    printf("Maximum of %d, %d and %d is %d",a,b,c,max(a,b,c));
}
