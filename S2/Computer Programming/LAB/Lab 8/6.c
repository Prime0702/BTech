/*
    6.  Declare an array of 5 integers. 
        Print out the address of each element of the array. 
        Toprint the address you can use %p printf() format which usually prints pointers inhexadecimal. 
        Use the %u (unsigned) printf() format if you would rather not deal with1hexadecimal notation. 
        Notice how the difference between each successive address issizeof(int).
*/
#include <stdio.h>
int main(){
    int a[5]={1,2,3,4,5};
    for(int i=0; i<5; i++)
        printf("index: %d\tvalue: %d\tlocation: %p\thexadecimal: %u\tsizeof(int)): %d\n",i,a[i],&a[i],&a[i],&a[i],sizeof(&a[i]));
    return 0;
}