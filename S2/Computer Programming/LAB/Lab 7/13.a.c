/*
    13. The string can be displayed on the screen using three ways:
        a Using printf() function
*/
#include <stdio.h>
int main(){
    char a[100];
    printf("Enter a string: ");
    scanf("%s",a);
    printf("The string is: %s",a);
    return 0;
}