//3. Write a program to find the transpose of a matrix.
#include<stdio.h>
int main()
{
    int a[10][10],b[10][10],i,j,r,c;
    printf("Enter the number of rows and columns of the matrix: ");
    scanf("%d%d",&r,&c);
    printf("Enter the elements of the matrix: \n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
            b[j][i]=a[i][j];
        }
    }
    printf("The transpose of the matrix is: \n");
    for(i=0;i<c;i++)
    {
        for(j=0;j<r;j++)
        {
            printf("%d ",b[i][j]);
        }
        printf("\n");
    }
    return 0;
}