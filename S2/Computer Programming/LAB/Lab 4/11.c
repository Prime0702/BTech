#include<stdio.h>
void fibo(int n){
    int a=0,b=1,z=a+b;
    for (int i=1;i<=n;i++){
        printf("%d\n",a);
        a=b;b=z;z=a+b;

    }
}
int main(){
    int n;
    printf("Enter the limit: ");scanf("%d",&n);
    fibo(n);
    return 0;
}
