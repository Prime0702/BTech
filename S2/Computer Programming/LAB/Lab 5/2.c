#include<stdio.h>
int gcd(int a,int b){
    return (b>a)?(b%a==0)?a:gcd(b%a,a):(a%b==0)?b:gcd(b,a%b);
}
int main(){
    int x,y;
    scanf("%d %d",&x,&y);
    printf("gcd: %d",gcd(x,y));
    return 0;
}
