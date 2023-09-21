//21. Write a C program to compare two strings. (Do the same operation using the string library function strcmp() and analyze the behavior; you should include string .h)
#include <stdio.h>
#include <string.h>
int main(){
    char a[]="Aadithyan";
    char b[]="Raju";
    int i=0;
    while(a[i]!='\0'&&b[i]!='\0'){
        if(a[i]!=b[i]){
            break;
        }
        i++;
    }
    if(a[i]==b[i]){
        printf("The strings are equal\n");
    }
    else if(a[i]>b[i]){
        printf("The first string is greater than the second string\n");
    }
    else{
        printf("The first string is lesser than the second string\n");
    }
    printf("The strings are equal: %d\n",strcmp(a,b));
    printf("The first string is greater than the second string: %d\n",strcmp(a,b));
    printf("The first string is lesser than the second string: %d",strcmp(a,b));
    return 0;
}