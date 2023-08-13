#include <stdio.h>
#include <stdlib.h>
int main(){
    int * p = (int *) malloc( sizeof(int) ); 
    int * q = p;
    free(p); 
    *q = 10;
    printf("%d\n",*q);
    free(q);
    return 0;    
}