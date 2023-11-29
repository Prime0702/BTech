//14. Run the following program and analyze the result.
#include<stdio.h>
int main(){
    char str[] = "Hello";
    printf("\n %s",str);
    printf("\n %s",&str);
    printf("\n%s",&str[2]);
}