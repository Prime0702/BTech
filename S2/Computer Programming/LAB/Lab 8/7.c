#include <stdio.h>
int main(){
    char str[6]="amrita";
    char *ptr;
    ptr=str;
    for (int i=0; i<6; i++){
        printf("%c\t",*ptr);
        ptr++;
    }
    return 0;
}