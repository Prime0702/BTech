#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
int main(){
    int status;
    pid_t pid_a = fork();
    if (pid_a == 0) {
        printf("Happy new year!\n");
        exit(0);
    }
    pid_t pid_b = fork();
    if (pid_b == 0) {
        int a;
        printf("Enter a: ");
        scanf("%d", &a);
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        printf("Sum of digits = %d\n", sum);
        exit(0);
    }
    waitpid(pid_a, &status, 0);
    waitpid(pid_b, &status, 0);
    return 0;
}