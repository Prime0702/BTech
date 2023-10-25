#include<stdio.h>
int main(){
    int p,t;
    float r,i;
    printf("Enter the deposit amount : ");
    scanf("%d",&p);
    printf("Enter the rate of simple interest per annum : ");
    scanf("%f",&r);
    printf("Enter the time for calculating the interest in years : ");
    scanf("%d",&t);
    i=p*r*t/100;
    printf("The interest amount :%.2f\n",i);
    return 0;
}