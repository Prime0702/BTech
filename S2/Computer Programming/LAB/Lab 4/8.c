#include<stdio.h>
float ar_c(float x){return 3.14*x*x;}
float pm_c(float x){return 3.14*2*x;}
float ar_r(float x, float y){return x*y;}
float pm_r(float x, float y){return x+x+y+y;}
int main(){
    int ch;
    float a,b;
    while (1){
        printf("1. Area of Circle\n");
        printf("2. Perimeter of circle\n");
        printf("3. Area of Rectangle\n");
        printf("4. Perimeter of Rectangle\n");
        printf("5. Exit\n");
        printf("Enter Your Choice: ");scanf("%d",&ch);
        if (ch==1){
            printf("Enter radius of circle: ");scanf("%f",&a);
            printf("Area of circle: %.2f\n",ar_c(a));
        }
        else if (ch==2){
            printf("Enter radius of circle: ");scanf("%f",&a);
            printf("Perimeter of circle: %.2f\n",pm_c(a));
        }
        else if (ch==3){
            printf("Enter Length of Rectangle: ");scanf("%f",&a);
            printf("Enter Bredth of Rectangle: ");scanf("%f",&b);
            printf("Area of Rectangle: %.2f\n",ar_r(a,b));
        }
        else if (ch==4){
            printf("Enter Length of Rectangle: ");scanf("%f",&a);
            printf("Enter Bredth of Rectangle: ");scanf("%f",&b);
            printf("Perimeter of Rectangle: %.2f\n",pm_r(a,b));
        }
        else if (ch==5){break;}
        else continue;
    }
    return 0;
}
