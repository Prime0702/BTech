//Using a while loop write a program that reads an integer until a value 999 is encountered. Alsocount the number of positive, negative and zeroes entered by the user.
#include<stdio.h>
int main(){
    int n,positive=0,negative=0,zero=0;
    printf("Enter integers (999 to stop): ");
    scanf("%d",&n);
    while(n!=999){
        if(n>0){
            positive++;
        }
        else if(n<0){
            negative++;
        }
        else{
            zero++;
        }
        scanf("%d",&n);
    }
    printf("Positive: %d\nNegative: %d\nZero: %d\n",positive,negative,zero);
    return 0;
}