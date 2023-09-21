#include<stdio.h>
int sum(int x, int y){
    return x+y;
}
int main(){
    int a,b,result;
    scanf("%d %d",&a,&b);
    result=sum(a,b);
    printf("%d",result);
    return 0;
}