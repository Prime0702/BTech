//23. Write a C program to print the longest word in a sentence.
#include <stdio.h>
#include <string.h>
int main(){
    char a[256],b[256],c[256];
    int i=0,j=0,k=0;
    printf("Enter a sentence: ");
    gets(a);
    while(a[i]!='\0'){
        if(a[i]==' '){
            b[j]='\0';
            if(strlen(b)>strlen(c)){
                strcpy(c,b);
            }
            j=0;
        }
        else{
            b[j]=a[i];
            j++;
        }
        i++;
    }
    b[j]='\0';
    if(strlen(b)>strlen(c)){
        strcpy(c,b);
    }
    printf("The longest word in the sentence is: %s",c);
    return 0;
}