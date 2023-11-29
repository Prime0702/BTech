//7. Write a program to multiply two matrices.
#include <stdio.h>
int main(){
    int r1,c1,r2,c2;
    printf("Enter the number of rows and columns of the first matrix: ");
    scanf("%d%d",&r1,&c1);
    int a[r1][c1];
    printf("Enter the elements of the first matrix: \n");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("Enter the number of rows and columns of the second matrix: ");
    scanf("%d%d",&r2,&c2);
    int b[r2][c2];
    printf("Enter the elements of the second matrix: \n");
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            scanf("%d",&b[i][j]);
        }
    }
    if(c1!=r2){
        printf("The matrices cannot be multiplied.");
        return 0;
    }
    int c[r1][c2];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            c[i][j]=0;
            for(int k=0;k<c1;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    printf("The product of the two matrices is: \n");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
    return 0;
}