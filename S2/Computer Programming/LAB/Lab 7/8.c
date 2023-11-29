//Write a program to find out whether a particular element is in the 2D integer array and print its row and column value using call by reference.
#include <stdio.h>
int r,c;
int check(int a[r][c],int n){
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]==n){
                return 1;
            }
        }
    }
    return 0;
}
int main(){
    printf("Enter the number of rows and columns of the matrix: ");
    scanf("%d%d",&r,&c);
    int a[r][c];
    printf("Enter the elements of the matrix: \n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&a[i][j]);
        }
    }
    int n;
    printf("Enter the element to be searched: ");
    scanf("%d",&n);
    if(check(a,n)){
        printf("The element is present in the matrix.");
    }
    else{
        printf("The element is not present in the matrix.");
    }
    return 0;
}