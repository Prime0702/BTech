#include <stdio.h>
int abs(int x){
    return (x<0)?-x:x;
}
int main(int argc, char const *argv[])
{
    int a;
    scanf("%d",&a);
    printf("%d\n",abs(a));
    return 0;
}
