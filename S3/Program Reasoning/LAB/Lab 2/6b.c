#include <stdio.h>
#include <stdlib.h>
int main(){
    //a
    int *ptr;
    //b
    ptr = (int *) malloc(sizeof(int));
    //c
    *ptr = 10;
    
    //e
    free(ptr);

    //d
    printf("%d\n",*ptr);

    return 0;    
}