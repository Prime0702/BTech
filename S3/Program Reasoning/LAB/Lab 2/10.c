#include<stdio.h>
int main(int argc, char const *argv[])
{
    int x,y;
    printf("x: ");scanf("%d",&x);
    printf("y: ");scanf("%d",&y);
    if (x==0 && y==0)printf("Origin\n");
    else if (x==0) printf("On X-Axis\n");
    else if (y==0) printf("On Y-Axis\n");
    else if (x>0) {
        if (y>0) printf("Q1\n");
        else printf("Q4\n");
    }
    else{
        if (y>0) printf("Q2\n");
        else printf("Q3\n");
    }
    return 0;
}
