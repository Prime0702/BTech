#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
    pid_t pid_a = getpid();
    printf("Process P: pid=%d, ppid=%d\n", pid_a, getppid());
    pid_t pid_b = fork();
    if (pid_b == 0) {
        printf("Process C1: pid=%d, ppid=%d\n", getpid(), getppid());
        pid_t pid_c = fork();
        if (pid_c == 0) {
            printf("Process C2: pid=%d, ppid=%d\n", getpid(), getppid());
            exit(0);
        }
        exit(0);
    }
    int status;
    wait(&status);

    return 0;
}
