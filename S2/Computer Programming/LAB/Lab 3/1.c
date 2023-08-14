#include <stdio.h>
int main(){
    //for loop
    for (int i = 1; i<=50; i=i+2){
        printf("%d\n",i);
    }
    //do while loop
    int i=1;
    do {
        printf("%d\n",i);
        i=i+2;
    } while (i<=50);
    //while loop
    i=1;
    while (i<=50){
        printf("%d\n",i);
        i=i+2;
    }
    return 0;
}