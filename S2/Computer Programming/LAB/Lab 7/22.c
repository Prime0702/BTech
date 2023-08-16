//22. Write a C program to check whether the entered string is a palindrome.
#include <stdio.h>
#include <string.h>
int main(){
    char a[100];
    printf("Enter a string: ");
    scanf("%s",a);
    int i=0;
    int j=strlen(a)-1;
    while(i<j){
        if(a[i]!=a[j]){
            break;
        }
        i++;
        j--;
    }
    if(i>=j){
        printf("The string is a palindrome");
    }
    else{
        printf("The string is not a palindrome");
    }
    return 0;
}