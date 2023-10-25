#include <stdio.h>
#include <stdlib.h>
int main(){
    long * ptr = (long *) malloc( sizeof(int) );
    *ptr = 10; 
    printf("%d\n",*ptr);
    free(ptr);
    return 0;    
}