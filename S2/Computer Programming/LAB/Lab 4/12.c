#include<stdio.h>
void fibo(int n){
    int a=0,b=1,z=a+b,i=3,j;
    for (i=1;i<=n;i++){
        for(j=b+1;j<z;j++){
            if (j>n)exit(0);
            printf("%d\n",j);
        }
        a=b;b=z;z=a+b;

    }
}
int main(){
    int n;
    printf("Enter the limit: ");scanf("%d",&n);
    fibo(n);
    return 0;
}
