//Write a program to find out whether a particular element is in the integer array using Binary search.
#include<stdio.h>
void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
void bubblesort(int arr[], int n){
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++){
            if (arr[j] > arr[j + 1]){
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}
void printArray(int arr[], int n){
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
}
int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++){
        printf("Enter number %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    bubblesort(arr, n);
    printf("The sorted array is: ");
    printArray(arr, n);
    printf("\n");
    int search;
    printf("Enter the number to search: ");
    scanf("%d", &search);
    int found = 0;
    int low = 0;
    int high = n - 1;
    int mid;
    while (low <= high){
        mid = (low + high) / 2;
        if (arr[mid] == search){
            found = 1;
            printf("The number %d is found at position %d", search, mid + 1);
            break;
        }
        else if (arr[mid] < search){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    if (found == 0){
        printf("The number %d is not found in the array", search);
    }
    return 0;
}