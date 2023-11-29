//Write a program to find whether the array of integers contains a duplicate number. If it’s there print the position of duplicate numbers.
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
    int duplicate = 0;
    for (int i = 0; i < n; i++){
        for (int j = i + 1; j < n; j++){
            if (arr[i] == arr[j]){
                duplicate = 1;
                printf("The duplicate number is %d at position %d", arr[i], i + 1);
                break;
            }
        }
        if (duplicate == 1){
            break;
        }
    }
    if (duplicate == 0){
        printf("There is no duplicate number in the array");
    }
    return 0;
}