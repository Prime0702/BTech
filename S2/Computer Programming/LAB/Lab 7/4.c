//4. Write a program to find the sum of all the elements in a 2D array.

#include <stdio.h>

int main(){
    int r,c,s=0;
    printf("Enter the number of rows and columns of the matrix: ");
    scanf("%d%d",&r,&c);
    int a[r][c];
    printf("Enter the elements of the matrix: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&a[i][j]);
            s+=a[i][j];
        }
    }
    printf("The sum of all the elements in the matrix is: %d",s);
    return 0;
}
/*
    Input: 
        Enter the number of rows and columns of the matrix: 2 2
        Enter the elements of the matrix: 
        1 2
        3 4
    Output:
        The sum of all the elements in the matrix is: 10
*/