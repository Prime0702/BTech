#include<stdio.h>
#include<math.h>
int fact(int x){
    int f=1,i=1;
    while (i<=x){
        f*=i;
        i++;
    }
    return f;
}
float p(int n){
    int i=1;
    float s=0;
    while (i<=n){
        s+=(pow(i,i)/fact(i));
        i++;
    }
    return s;
}
int main(){
    int n;
    printf("Enter limit: ");scanf("%d",&n);
    printf("%.2f",p(n));
    return 0;
}
