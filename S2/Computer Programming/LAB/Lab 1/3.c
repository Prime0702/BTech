#include<stdio.h>
#define pi 3.14
int main(){
    float r,sa,vol;
    printf("Enter the radius of the Sphere: ");
    scanf("%f",&r);
    sa=4*pi*r*r;
    vol=4*pi*r*r*r/3;
    printf("Surface Area of Sphere : %.2f\n",sa);
    printf("Volume of Sphere : %.2f\n",vol);
    return 0;
}