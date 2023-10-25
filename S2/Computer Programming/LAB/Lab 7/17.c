//17. Write a C program to copy one string to another without using any string library functions. Do the same operation using strcpy() function in string.h
#include <stdio.h>
#include <string.h>
int main(){
    char a[]="Aadithyan Raju";
    char b[sizeof(a)/sizeof(a[0])];
    int i=0;
    while(a[i]!='\0'){
        b[i]=a[i];
        i++;
    }
    b[i]='\0';
    printf("The copied string is: %s\n",b);
    strcpy(b,a);
    printf("The copied string is: %s",b);
    return 0;
}