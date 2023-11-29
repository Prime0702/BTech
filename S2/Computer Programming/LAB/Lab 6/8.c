//Modify the last program so that instead of finding the largest element in the array, the program sorts the elements of the array into ascending order.
#include <stdlib.h>
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
    int arr[10];
    for (int i = 0; i < 10; i++){
        arr[i] = rand() % 1000;
    }
    printf("The array is: ");
    printArray(arr, 10);
    printf("\n");
    bubblesort(arr, 10);
    printf("The sorted array is: ");
    printArray(arr, 10);
    return 0;
}