#include<stdio.h>
int hcf(int x, int y){
    int h=0;
    int m=(x>y)?x:y;
    for (int i=2;i<=m;i++){if(x%i==0 && y%i==0)h=i;}
    return h;
}
int main(){
    int a,b;
    printf("Enter two numbers: ");scanf("%d %d",&a,&b);
    printf("HCF of %d and %d is %d",a,b,hcf(a,b));
    return 0;
}
