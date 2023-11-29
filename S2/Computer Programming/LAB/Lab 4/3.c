#include <stdio.h>
int ld(int a){
    int m;
    int l=a%10;
    while (a!=0){
        m=a%10;
        if (l<m) l=m;
        a/=10;
    }
    return l;
}
int main(){
    int n;
    printf("Enter Number : ");scanf("%d",&n);
    printf("Largest digit is %d\n",ld(n));
    return 0;
}
