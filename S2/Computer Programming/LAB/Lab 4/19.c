#include<stdio.h>
int hcf(int x, int y){
    int h=0;
    for (int i=(x>y)?x:y;;i++){if(i%x==0 && i%y==0){h=i;break;}}
    return h;
}
int main(){
    int a,b;
    printf("Enter two numbers: ");scanf("%d %d",&a,&b);
    printf("HCF of %d and %d is %d",a,b,hcf(a,b));
    return 0;
}
