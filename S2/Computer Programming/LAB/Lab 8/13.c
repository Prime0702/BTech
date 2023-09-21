#include <stdio.h>
void read_array(int *arr, int n){
    for(int i=0; i<n; i++){
        printf("Enter the element %d: ",i+1);
        scanf("%d",arr+i);
    }
}
void print_array(int *arr, int n){
    for(int i=0; i<n; i++){
        printf("%d ",*(arr+i));
    }
}
void find_small(int *arr, int n, int *small, int *pos){
    *small=*arr;
    for(int i=0; i<n; i++){
        if (*small>*(arr+i)){
            *small=*(arr+i);
            *pos=i;
        }
    }
}
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int arr[n];
    read_array(arr,n);
    printf("The array is: ");
    print_array(arr,n);
    int small,pos;
    find_small(arr,n,&small,&pos);
    printf("\nThe smallest element is %d at position %d",small,pos);
    return 0;
}