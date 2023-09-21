//Read an array of size n and a variable k from the user. find all the pairs of elements in the arraywhich yields a sum as k.
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
    int k;
    printf("Enter the value of k: ");
    scanf("%d", &k);
    int count = 0;
    for (int i = 0; i < n; i++){
        for (int j = i + 1; j < n; j++){
            if ((arr[i] + arr[j]) == k){
                count++;
                printf("%d + %d = %d\n", arr[i], arr[j], k);
            }
        }
    }
    if (count == 0){
        printf("No such pair exists");
    }
    return 0;
}