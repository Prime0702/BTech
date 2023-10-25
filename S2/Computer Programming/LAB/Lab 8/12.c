#include <stdio.h>
void StringCat( char *dest, char *src){
    int k;
    for(int i=0; i<15; i++){
        if (*dest=='\0'){
            k=i;
            break;
        }
    }
    for(int i=0; i<15; i++){
        if (*src=='\0'){
            dest[k+i]=src[i];
        }
    }
}
int main(){
    char dest[10];
    printf("Enter the dest string: ");
    scanf("%s",dest);
    char src[10];
    printf("Enter the src string: ");
    scanf("%s",src);
    StringCat(dest,src);
    printf("The dest string is: %s",dest);
    return 0;
    
}