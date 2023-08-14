//Modify the last program to find the mean of n numbers using arrays.
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
    int sum = 0;
    for (int i = 0; i < n; i++){
        sum += arr[i];
    }
    printf("The mean of the array is %d", sum / n);
    return 0;
}