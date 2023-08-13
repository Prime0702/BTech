#include <stdio.h>
#include <stdlib.h>
int main(){
    int * p = (int *) malloc( sizeof(int) ); 
    *p = 5;
    int * q = (int *) malloc( sizeof(int) ); 
    *q = 10;
    p = q; 
    printf("%d\n",*p);
    free(p);
    free(q);
    return 0;    
}