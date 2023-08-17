#include <stdio.h>
void charPrint(char *x){
    for (int i=0; i<6; i++){
        printf("%c\t",*x);
        x++;
    }
}
int main(){
    char str[6]="amrita";
    char *ptr;
    ptr=str;
    charPrint(ptr);
    return 0;
}