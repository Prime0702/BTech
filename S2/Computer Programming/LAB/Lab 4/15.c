#include <stdio.h>
#include <stdlib.h>
void customer();
void amount (int,int);
void count(int,int);
void menu();
int t1=0,t2=0,t3=0,t4=0;

int main()
{
    menu();
    customer();
    return 0;
}

void customer()
{
    int c,n;
    printf("Enter your choice: ");scanf("%d",&c);
    printf("Enter the quantity: ");scanf("%d",&n);
    amount(c,n);
}
void amount(int c,int n)
{
    int ta=0;
    float da=0,discount=0;
    switch(c)
    {
        case 1:
                ta=n*50;
                discount=ta*0.1;
                da=ta-discount;
                break;
        case 2:
                ta=n*60;
                discount=ta*0.12;
                da=ta-discount;
                break;
        case 3:
                ta=n*42;
                discount=ta*0.06;
                da=ta-discount;
                break;
        case 4:
                ta=n*55;
                discount=ta*0.08;
                da=ta-discount;
                break;
        default:
                printf("Enter a Valid Choice!\n");
                customer();
                break;
        }
        printf("Full Amount = %d\n",ta);
        printf("Discount = %0.2f\n",discount);
        printf("Amount to be paid = %0.2f\n",da);
        count(c,n);
    }
void count(int c,int n)
{
    char p;
    switch(c)
    {
        case 1:
                t1+=n;
                break;
        case 2:
                t2+=n;
                break;
        case 3:
                t3+=n;
                break;
        case 4:
                t4+=n;
                break;
    }
    while (1){
        printf("Do you have another customer? y=yes / n=no\n");
        scanf(" %c",&p);
        if(p=='y')
        {
            menu();
            customer();
        }
        else if (p=='n')
        {
            printf("Total Amount of chocolates sold :\n");
            printf("SI.no | Chocolate Type        | Amount\n");
            printf("   1  | White Chocolate       | %d\n",t1);
            printf("   2  | Dark Chocolate        | %d\n",t2);
            printf("   3  | Raw Chocolate         | %d\n",t3);
            printf("   4  | Bittersweet Chocolate |  %d\n",t4);
            break;
        }
    }
}
void menu(){
    printf("SI.no |  Chocolate Type        | Price(Rs.) | Discount(%) \n");
    printf("   1  |  White Chocolate       |   50       | 10      \n");
    printf("   2  |  Dark Chocolate        |   60       | 12      \n");
    printf("   3  |  Raw Chocolate         |   42       |  6      \n");
    printf("   4  |  Bittersweet Chocolate |   55       |  8      \n");
}
