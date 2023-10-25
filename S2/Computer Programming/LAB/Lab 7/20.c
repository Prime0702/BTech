//20. Write a C program to concatenate two strings. (Do the same operation using the string libraryfunction strcat() and analyze the behavior; you should include string .h)
#include <stdio.h>
#include <string.h>
int main(){
    char a[]="Aadithyan";
    char b[]="Raju";
    char c[sizeof(a)/sizeof(a[0])+sizeof(b)/sizeof(b[0])];
    int i=0,j=0;
    while(a[i]!='\0'){
        c[i]=a[i];
        i++;
    }
    while(b[j]!='\0'){
        c[i]=b[j];
        i++;
        j++;
    }
    c[i]='\0';
    printf("The concatenated string is: %s\n",c);
    strcat(a,b);
    printf("The concatenated string is: %s",a);
    return 0;
}