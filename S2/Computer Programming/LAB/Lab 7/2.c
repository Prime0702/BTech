//2. Write a program to add two matrices.
#include<stdio.h>
int main(){
    int n, m;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    printf("Enter the number of columns: ");
    scanf("%d", &m);
    int arr1[n][m], arr2[n][m], sum[n][m];
    printf("Enter the elements of the first matrix:\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            printf("Enter element [%d][%d]: ", i, j);
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("Enter the elements of the second matrix:\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            printf("Enter element [%d][%d]: ", i, j);
            scanf("%d", &arr2[i][j]);
        }
    }
    printf("The sum of the two matrices is:\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            sum[i][j] = arr1[i][j] + arr2[i][j];
            printf("%d\t", sum[i][j]);
        }
        printf("\n");
    }
    return 0;
}