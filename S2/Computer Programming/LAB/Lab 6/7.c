//Write a program that can store 10 integers in an array. 
//Fill the array with “random” numbers using the library functions rand() instead of reading them from the user. 
//Find the largest element in the array and print it out.
//Each time rand() is called it returns a “random” integer. 
//Use the mod operator ( % ) to get a value inthe desired range. 
//For example:int result; result = rand() % 1000;will assign a random value in the range 0 – 999 to the variable result. 
//Make sure your program contains the line:
#include <stdlib.h>
//to include information about the rand() function.
#include<stdio.h>
int main(){
    int arr[10];
    for (int i = 0; i < 10; i++){
        arr[i] = rand() % 1000;
    }
    printf("The array is: ");
    for (int i = 0; i < 10; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
    int max = arr[0];
    for (int i = 1; i < 10; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    printf("The largest value in the array is %d", max);
    return 0;
}