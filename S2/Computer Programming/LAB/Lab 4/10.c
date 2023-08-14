#include<stdio.h>
#include<math.h>
float compound(float p,float r,int t){
    return p*pow((1+r/100),t)-p;
}
int main(){
    float p,r;
    int t;
    printf("Enter the principal amount: ");scanf("%f",&p);
    printf("Enter the interest rate: ");scanf("%f",&r);
    printf("Enter the time period: ");scanf("%d",&t);
    float ci=compound(p,r,t);
    printf("Compound Interest: %.2f\n",ci);
    printf("Total Amount: %.2f",ci+p);
    return 0;
}
