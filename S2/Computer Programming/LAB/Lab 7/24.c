//24. Wite a C Program to sort a list of given names; you can choose any one of the sorting algorithms.
#include <stdio.h>
#include <string.h>
int main(){
    char a[10][100];
    int n;
    printf("Enter the number of names: ");
    scanf("%d",&n);
    printf("Enter the names: ");
    for(int i=0;i<n;i++){
        scanf("%s",a[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(strcmp(a[j],a[j+1])>0){
                char temp[100];
                strcpy(temp,a[j]);
                strcpy(a[j],a[j+1]);
                strcpy(a[j+1],temp);
            }
        }
    }
    printf("The sorted names are: ");
    for(int i=0;i<n;i++){
        printf("%s ",a[i]);
    }
    return 0;
}