/*
    13. The string can be displayed on the screen using three ways:
        b Using puts() function
*/
#include <stdio.h>
int main(){
    char a[100];
    printf("Enter a string: ");
    scanf("%s",a);
    puts(a);
    return 0;
}