#include <stdio.h>
#include <stdlib.h>
int main(){
    int n,i,*ptr;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    ptr=(int*)malloc(n*sizeof(int));
    if (ptr==NULL){
        printf("Memory not allocated");
        exit(0);
    }
    for(i=0; i<n; i++){
        printf("Enter the element %d: ",i+1);
        scanf("%d",ptr+i);
    }
    printf("The array is: ");
    for(i=0; i<n; i++){
        printf("%d ",*(ptr+i));
    }
    free(ptr);
    return 0;
}