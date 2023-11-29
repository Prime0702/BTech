#include <stdio.h>
void StringCopy(char *dest, const char * source){
    while(*source){
        *dest=*source;
        dest++;
        source++;
    }
    *dest='\0';
}
int main(){
    char source[10];
    printf("Enter the src string: ");
    scanf("%s",source);
    char dest[10];
    StringCopy(dest,source);
    printf("The dest string is: %s",dest);
    return 0;
}