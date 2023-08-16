//15. Run the following program and analyze the result. It’s about the use of width and precisionspecifications along with %s .
#include<stdio.h>
int main(){
    char str[] = "Introduction to C";
    printf("\n |%s|",str);
    printf("\n |%20s|",str);
    printf("\n |%20s|",str);
    printf("\n |%.4s|",str);
    printf("\n |%20.4s|",str);
    printf("\n |%-20.4s|",str);
}