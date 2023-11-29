/*
    10. It is the programmer’s responsibility to keep a pointer into an array inside the arraybounds. 
        Compilers do not catch the error if the pointer is moved outside the array.
        Using an invalid pointer may write into memory being used for other variables. 
        To demonstrate this, try the following. 
        Define the variables:
            Char s1[5] = “AAA”, s2[5], *s;
*/
#include <stdio.h>
int main(){
    char s1[5] = "AAA", s2[5], *s;
    s=s1;
    printf("%s\n",s);
    s=s2;
    printf("%s\n",s);
    return 0;
}