/*
    13. The string can be displayed on the screen using three ways:
    c Using putchar()function repeatedly.
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
    i=0;
    while(a[i]!='\0'){
        putchar(a[i]);
        i++;
    }
    return 0;
}