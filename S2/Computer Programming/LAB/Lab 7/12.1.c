/*
    12. If we declare a string by writing char str[50]; Then str can be read by the user by using three ways:
        1. Using scanf() function
*/
#include <stdio.h>
int main(){
    char a[100];
    printf("Enter a string: ");
    scanf("%s",a);
    printf("The string is: %s",a);
    return 0;
}