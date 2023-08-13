#include <stdio.h>
#include <stdlib.h>
int main(){
    //a
    int *ptr;
    //b
    //ptr = (int *) malloc(sizeof(int));
    //c
    *ptr = 10;
    //d
    printf("%d\n",*ptr);
    //e
    free(ptr);

    return 0;    
}