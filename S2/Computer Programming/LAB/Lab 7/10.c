/*
    10. Write a program to Sort Rows of the Matrix in Ascending & Columns in Descending Order.
    Sample Output
    Enter the order of the matrix
    3 3
    Enter co-efficients of the matrix
    3 7 9
    2 4 8
    5 2 6
    The given matrix is
    3 7 9
    2 4 8
    5 2 6
    After arranging rows in ascending order
    3 7 9
    2 4 8
    2 5 6
    After arranging the columns in descending order
    5 7 9
    3 4 8
    2 2 6
*/
#include <stdio.h>
void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}
void bubbleSort(int a[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]) swap(&a[j],&a[j+1]);
        }
    }
}
int main(){
    int r, c;
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
    printf("After arranging rows in ascending order: \n");
    for(int i=0;i<r;i++){
        bubbleSort(a[i],c);
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("After arranging the columns in descending order: \n");
    for(int i=0;i<c;i++){
        int temp[r];
        for(int j=0;j<r;j++){
            temp[j]=a[j][i];
        }
        bubbleSort(temp,r);
        for(int j=0;j<r;j++){
            a[j][i]=temp[r-j-1];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    return 0;
    
}