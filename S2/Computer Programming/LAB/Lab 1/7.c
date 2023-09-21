#include<stdio.h>
int main(){
    int a,b,c,d,s;
    float p1,p2,p3,p4;
    printf("Enter four numbers: ");
    scanf("%d %d %d %d",&a,&b,&c,&d);
    s=a+b+c+d;
    p1=a*100/s;
    p2=b*100/s;
    p3=c*100/s;
    p4=d*100/s;
    printf("For %d the percentage is %.2f\n",a,p1);
    printf("For %d the percentage is %.2f\n",b,p2);
    printf("For %d the percentage is %.2f\n",c,p3);
    printf("For %d the percentage is %.2f\n",d,p4);
    return 0;
}