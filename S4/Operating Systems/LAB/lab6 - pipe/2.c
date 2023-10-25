#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>
#include <ctype.h>

#define SIZE 1024

int main() {
    int pipefd[2]; 
    pid_t pid;   
    char inputStr[SIZE];    
    char outputStr[SIZE];   


    if (pipe(pipefd) == -1) {
        perror("pipe");
        exit(EXIT_FAILURE);
    }
    pid = fork();
    if (pid == -1) {
        perror("fork");
        exit(EXIT_FAILURE);
    }

    if (pid == 0) {
        close(pipefd[1]);  
        int sum=0;
        while(1){
            read(pipefd[0], outputStr, sizeof(outputStr));
            atoi(outputStr);
            sum+=atoi(outputStr);
            printf("SUM : %d\n", sum);
        }
        close(pipefd[0]);
    } else {
        close(pipefd[0]); 
        while(1){
        fgets(inputStr, SIZE, stdin);
        write(pipefd[1], inputStr, strlen(inputStr) + 1);
        }
        close(pipefd[1]); 
        exit(EXIT_SUCCESS);
        wait(NULL);  
        exit(EXIT_SUCCESS);
    }
}