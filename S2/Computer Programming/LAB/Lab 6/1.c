//Write a program that reads in 10 integers from the user and stores them in an array. Find the largest value in the array and print it.
#include<stdio.h>
int main(){
    int arr[10];
    for (int i = 0; i < 10; i++){
        printf("Enter number %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    int max = arr[0];
    for (int i = 1; i < 10; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    printf("The largest value in the array is %d", max);
    return 0;
}