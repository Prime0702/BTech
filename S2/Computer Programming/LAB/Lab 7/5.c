//5. Write a program to find the sum of the elements in each row of a 2D array and print it.
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
    printf("The sum of the elements in each row of the matrix is: \n");
    for(int i=0;i<r;i++){
        int s=0;
        for(int j=0;j<c;j++){
            s+=a[i][j];
        }
        printf("%d\n",s);
    }
    return 0;
}
/*
    Input: 
        Enter the number of rows and columns of the matrix: 2 2
        Enter the elements of the matrix: 
        1 2
        3 4
    Output:
        The sum of the elements in each row of the matrix is: 
        3
        7
*/