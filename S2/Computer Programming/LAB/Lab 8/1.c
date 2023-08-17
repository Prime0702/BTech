//1. Run the following program and understand the concept of pointers:
#include<stdio.h>
main(){
    int a=10;
    int * b; 
    b= &a; 
    printf(" \n a=%d\t b=%d\t*b=%d\n",a,&a,*b);
}
//a=10 b=address of a *b=10