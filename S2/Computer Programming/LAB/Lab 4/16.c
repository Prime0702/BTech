#include<stdio.h>
int seq(int n){
    int p=1,temp=n;
    while (n){
        p*=(n%10==0)?1:n%10;
        n/=10;
    }
    return temp+p;
}
int main(){
    int n,out;
    printf("Enter number of terms: ");scanf("%d",&n);
    for(int i=1;n--;){
            printf("%d\n",i);
            i=seq(i);
    }
    return 0;
}
