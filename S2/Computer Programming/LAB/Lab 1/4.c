#include<stdio.h>
int main(){
    float F,C;
    printf("Enter Temperature in Celsius : ");
    scanf("%f",&C);
    F = C * (9/5) + 32;
    printf("Temperature in Fahrenheit : %.1f\n",F);
    return 0;
}