/*
    11. Write a program to do the Sum of the Main & Opposite Diagonal Elements of a MxN Matrix.
    Sample Output
    Enter the order of the matix
    2 2
    Enter the co-efficients of the matrix
    40 30
    38 90
    The given matrix is
    40 30
    38 90
    The sum of the main diagonal elements is = 130
    The sum of the off diagonal elements is = 68
*/
#include <stdio.h>
int main(){
    int r,c;
    printf("Enter the number of rows and columns of the matrix: ");
    scanf("%d%d",&r,&c);
    int a[r][c];
    printf("Enter the elements of the matrix: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("The given matrix is: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    int s1=0,s2=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i==j) s1+=a[i][j];
            if(i+j==r-1) s2+=a[i][j];
        }
    }
    printf("The sum of the main diagonal elements is = %d\n",s1);
    printf("The sum of the off diagonal elements is = %d\n",s2);
    return 0;
}