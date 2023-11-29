//Write a program to interchange the largest and the smallest number in the array.
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
    int max = arr[0];
    int min = arr[0];
    int max_index = 0;
    int min_index = 0;
    for (int i = 1; i < n; i++){
        if (arr[i] > max){
            max = arr[i];
            max_index = i;
        }
        if (arr[i] < min){
            min = arr[i];
            min_index = i;
        }
    }
    int temp = arr[max_index];
    arr[max_index] = arr[min_index];
    arr[min_index] = temp;
    printf("The array after interchanging the largest and smallest number is:\n");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    return 0;
}