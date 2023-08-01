#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <sys/wait.h>
#define SIZE 1024

int main(){
    char str[SIZE];
    char str2[SIZE];
    scanf("%s", str);
    printf("%d %d", strlen(str), strlen(str2));
    return 0;
}