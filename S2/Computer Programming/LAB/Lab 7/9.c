//9. Write a program to interchange any two Rows & Columns in the given Matrix.
#include <stdio.h>
int main(){
    printf("Enter the number of rows and columns of the matrix: ");
    int r,c;
    scanf("%d%d",&r,&c);
    int a[r][c];
    printf("Enter the elements of the matrix: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("Enter the row numbers to be interchanged: ");
    int r1,r2;
    scanf("%d%d",&r1,&r2);
    int temp;
    for(int i=0;i<c;i++){
        temp=a[r1-1][i];
        a[r1-1][i]=a[r2-1][i];
        a[r2-1][i]=temp;
    }
    printf("The matrix after interchanging the rows is: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("Enter the column numbers to be interchanged: ");
    int c1,c2;
    scanf("%d%d",&c1,&c2);
    for(int i=0;i<r;i++){
        temp=a[i][c1-1];
        a[i][c1-1]=a[i][c2-1];
        a[i][c2-1]=temp;
    }
    printf("The matrix after interchanging the columns is: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    return 0;
}
/*
    Input:
        Enter the number of rows and columns of the matrix: 2 2
        Enter the elements of the matrix: 
        1 2
        3 4
        Enter the row numbers to be interchanged: 1 2
        Enter the column numbers to be interchanged: 1 2
    Output:
        The matrix after interchanging the rows is: 
        3 4
        1 2
        The matrix after interchanging the columns is: 
        4 3
        2 1
*/