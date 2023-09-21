#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
    // Create process A
    pid_t pid_a = getpid();
    printf("Process A: pid=%d, ppid=%d, label=A\n", pid_a, getppid());

    // Create process B
    pid_t pid_b = fork();
    if (pid_b == 0) {
        printf("Process B: pid=%d, ppid=%d, label=B\n", getpid(), getppid());
        exit(0);
    }

    // Create process C
    pid_t pid_c = fork();
    if (pid_c == 0) {
        printf("Process C: pid=%d, ppid=%d, label=C\n", getpid(), getppid());

        // Create process E
        pid_t pid_e = fork();
        if (pid_e == 0) {
            printf("Process E: pid=%d, ppid=%d, label=E\n", getpid(), getppid());
            exit(0);
        }

        // Create process F
        pid_t pid_f = fork();
        if (pid_f == 0) {
            printf("Process F: pid=%d, ppid=%d, label=F\n", getpid(), getppid());
            exit(0);
        }

        exit(0);
    }

    // Create process D
    pid_t pid_d = fork();
    if (pid_d == 0) {
        printf("Process D: pid=%d, ppid=%d, label=D\n", getpid(), getppid());

        // Create process G
        pid_t pid_g = fork();
        if (pid_g == 0) {
            printf("Process G: pid=%d, ppid=%d, label=G\n", getpid(), getppid());

            // Create process H
            pid_t pid_h = fork();
            if (pid_h == 0) {
                printf("Process H: pid=%d, ppid=%d, label=H\n", getpid(), getppid());
                exit(0);
            }

            // Create process I
            pid_t pid_i = fork();
            if (pid_i == 0) {
                printf("Process I: pid=%d, ppid=%d, label=I\n", getpid(), getppid());
                exit(0);
            }

            exit(0);
        }

        exit(0);
    }

    // Wait for all child processes to finish
    
    int status;
    wait(&status);
    wait(&status);
    wait(&status);
    wait(&status);
    wait(&status);
    wait(&status);
    sleep(1);
    return 0;
}
