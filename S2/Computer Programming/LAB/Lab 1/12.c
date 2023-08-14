#include <stdio.h>
#include <math.h>
int main(){
    float Ax,Ay,Bx,By,Cx,Cy,A,B,C,s,area;
    printf("Enter the coordinates of the point A: ");
    scanf("%f %f",&Ax,&Ay);
    printf("Enter the coordinates of the point B: ");
    scanf("%f %f",&Bx,&By);
    printf("Enter the coordinates of the point C: ");
    scanf("%f %f",&Cx,&Cy);
    A=sqrt(((Bx-Ax)*(Bx-Ax))+((By-Ay)*(By-Ay)));
    B=sqrt(((Cx-Bx)*(Cx-Bx))+((Cy-By)*(Cy-By)));
    C=sqrt(((Ax-Cx)*(Ax-Cx))+((Ay-Cy)*(Ay-Cy)));
    printf("Lenght of AB: %.2f\n",A);
    printf("Lenght of BC: %.2f\n",B);
    printf("Lenght of CA: %.2f\n",C);
    s=((A+B+C)/2);
    area=sqrt(s*(s-A)*(s-B)*(s-C));
    printf("Area Of Triangle: %.2f\n",area);
    return 0;
}