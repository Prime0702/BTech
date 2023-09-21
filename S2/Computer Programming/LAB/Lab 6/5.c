//Write a program to find the second biggest number using an array of n numbers.
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
    int second_max = arr[0];
    for (int i = 1; i < n; i++){
        if (arr[i] > max){
            second_max = max;
            max = arr[i];
        }
        else if (arr[i] > second_max){
            second_max = arr[i];
        }
    }
    printf("The second largest value in the array is %d", second_max);
    return 0;
}