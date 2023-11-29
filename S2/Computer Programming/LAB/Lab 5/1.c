#include<stdio.h>
int fib(int n){
    return (n<=1)?n:(fib(n-1)+fib(n-2));
}
int main(){
    int t;scanf("%d",&t);
    printf("%d\n",fib(t-1));

}
