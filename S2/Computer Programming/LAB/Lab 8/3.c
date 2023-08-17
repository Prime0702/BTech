#include <stdio.h>
void CharSwap(char *a, char *b){
    char temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int main(){
    char str[5]="abcde";
    CharSwap(&str[1],&str[3]);
    printf("%s\n",str);
    return 0;
}