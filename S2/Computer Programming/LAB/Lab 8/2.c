#include <stdio.h>
int main(){
    int x, *ip;
    ip=&x;
    scanf("%d",ip);
    printf("%d\n",x);
    ++(*ip);
    printf("%d\n",x);
    ++x;
    printf("%d\n",*ip);
    return 0;
}