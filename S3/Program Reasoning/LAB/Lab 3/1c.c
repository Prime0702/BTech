#include<stdio.h>
int main(){
    int a,s=0;
    scanf("%d",&a);
    while (a)
    {
        if(a>=100)a-=100;
        else if (a>=50)a-=50;
        else if (a>=10)a-=10;
        else if (a>=5)a-=5;
        else if (a>=2)a-=2;
        else a--;
        s++;
    }
    printf("%d",s);
    return 0;
}