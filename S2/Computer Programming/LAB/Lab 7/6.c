//Write a program to fill a square matrix with value 0 on the diagonal, 1 on the upper right triagle and -1 on the lower left triangle.
#include <stdio.h>
int main(){
    int n;
    printf("Enter the size of the matrix: ");
    scanf("%d",&n);
    int a[n][n];
    printf("The matrix is: \n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                a[i][j]=0;
            }
            else if(i<j){
                a[i][j]=1;
            }
            else{
                a[i][j]=-1;
            }
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
/*
    Input: 
        Enter the size of the matrix: 3
    Output:
        The matrix is: 
        0 1 1 
        -1 0 1 
        -1 -1 0 
*/