#include<stdio.h>
void digits(int n){
    while (n){
        switch(n%10){
            case 1: printf("ONE ");break;
            case 2: printf("TWO ");break;
            case 3: printf("THREE ");break;
            case 4: printf("FOUR ");break;
            case 5: printf("FIVE ");break;
            case 6: printf("SIX ");break;
            case 7: printf("SEVEN ");break;
            case 8: printf("EIGHT ");break;
            case 9: printf("NINE ");break;
            case 0: printf("TEN ");break;
        }n/=10;
    }
}

int main(){
    int n;
    printf("Enter number between 100 and 9999: ");scanf("%d",&n);
    if (n>100 && n<9999)digits(n);
    return 0;
}
