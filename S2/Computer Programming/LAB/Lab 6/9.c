//Write a program to find out whether a particular element is in the integer array using Linear search.
#include<stdio.h>
int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++){
        printf("Enter number %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    int search;
    printf("Enter the number to search: ");
    scanf("%d", &search);
    int found = 0;
    for (int i = 0; i < n; i++){
        if (arr[i] == search){
            found = 1;
            printf("The number %d is found at position %d", search, i + 1);
            break;
        }
    }
    if (found == 0){
        printf("The number %d is not found in the array", search);
    }
    return 0;
}