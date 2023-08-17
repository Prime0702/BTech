#include <stdio.h>
void swap(int *a, int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
void bubbleSort(int *a, int n){
    int i,j;
    for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                swap(&a[j],&a[j+1]);
            }
        }
    }
}
void input( int *small, int *medium, int *large){
    int a[3]={*small,*medium,*large};
    bubbleSort(a,3);
    *small=a[0];
    *medium=a[1];
    *large=a[2];
}
int main(){
    int small,medium,large;
    printf("Enter three numbers: ");
    scanf("%d%d%d",&small,&medium,&large);
    input(&small,&medium,&large);
    printf("The numbers in ascending order are: %d %d %d",small,medium,large);
    return 0;
}
