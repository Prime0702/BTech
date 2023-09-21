#include<stdio.h>
int isFactorialSum(int n){
    int temp=n,sum=0;
    while (n){
        int f=1;
        for(int i=1;i<=n%10;i++){
            f*=i;
        }
        sum+=f;
        n/=10;
    }
    return (temp==sum)?1:0;
}
int main(){
    int r;
    printf("Enter the range: ");scanf("%d",&r);
    for(int i=1;i<=r;i++){
        if(isFactorialSum(i)){
            printf("%d\n",i);
        }
    }
    return 0;
}
