//16. Write a C program to find the length of a string without using the string handling functions. Do the same operation using the strlen() function in string.h
#include <stdio.h>
#include <string.h>
int main(){
    char a[]="Hello";
    int i=0;
    while(a[i]!='\0'){
        i++;
    }
    printf("The length of the string is: %d\n",i);
    printf("The length of the string is: %d",strlen(a));
    return 0;
}