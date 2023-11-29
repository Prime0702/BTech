#include<stdio.h>
void rotations(int arr[], int k, int dir, int n){
    if (k){
        if (dir){
            int temp = arr[n - 1];
            for (int i = n - 2; i > -1; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
        else{
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
        }
        rotations(arr, k - 1, dir, n);
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
    printf("The array is: ");
    printArray(arr, n);
    printf("\n");
    int k;
    printf("Enter the number of rotations: ");
    scanf("%d", &k);
    int dir;
    printf("Enter the direction of rotation (0 for left, 1 for right): ");
    scanf("%d", &dir);
    if (dir == 0 || dir == 1){
        rotations(arr, k, dir, n);
        printf("The rotated array is: ");
        printArray(arr, n);
    }
    else{
        printf("Invalid direction");
    }
    return 0;
}