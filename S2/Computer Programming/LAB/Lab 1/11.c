#include<stdio.h>
int main(){
    double a,b,c,d,f;
    a=2.9678e-27;
    b=0.876e-38;
    c=7.025e16;
    d=9.75e12;
    f=(a+b)/(c-d);
    printf("The value of F= %e",f);
    return 0;
}