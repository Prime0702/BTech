/*
    12. If we declare a string by writing char str[50]; Then str can be read by the user by using three ways:
        3. Using getchar() function repeatedly
*/
#include <stdio.h>
int main(){
    char a[100];
    printf("Enter a string: ");
    int i=0;
    while((a[i]=getchar())!='\n'){
        i++;
    }
    a[i]='\0';
    printf("The string is: %s",a);
    return 0;
}