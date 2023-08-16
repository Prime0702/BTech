//18. Write a C program to convert lowercase characters of a string to upper case.
#include <stdio.h>
#include <string.h>
int main(){
    char a[]="Aadithyan Raju";
    int i=0;
    while(a[i]!='\0'){
        if(a[i]>='a'&&a[i]<='z'){
            a[i]=a[i]-32;
        }
        i++;
    }
    printf("The string in uppercase is: %s",a);
    return 0;
}