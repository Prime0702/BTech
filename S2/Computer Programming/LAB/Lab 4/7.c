#include<stdio.h>
void add(){
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    printf("Sum = %d\n",x+y);
}
void sub(){
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    printf("Difference = %d\n",x-y);
}
void mul(){
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    printf("Product = %d\n",x*y);
}
void div(){
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);
    printf("Quotient = %d\n",x/y);
}

int main(){
    int a;
    while (1){
        printf("1. Add\n");
        printf("2. Subtract\n");
        printf("3. Multiply\n");
        printf("4. Divide\n");
        printf("5. Exit\n");
        printf("Enter the choice: ");scanf("%d",&a);
        if (a==1)add();
        else if (a==2)sub();
        else if (a==3)mul();
        else if (a==4)div();
        else if (a==5)break;
        else continue;
    }
    return 0;
}
