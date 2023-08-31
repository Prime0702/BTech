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
        close(pipefd[0]); 
        printf("Enter a string= ");
        fgets(inputStr, SIZE, stdin);
        write(pipefd[1], inputStr, strlen(inputStr) + 1);
        close(pipefd[1]); 
        exit(EXIT_SUCCESS);
    } else {
        close(pipefd[1]);  
        read(pipefd[0], outputStr, sizeof(outputStr));
        close(pipefd[0]); 
        for (int i = 0; outputStr[i] != '\0'; i++) {
            outputStr[i] = toupper(outputStr[i]);
        }
        printf("Uppercase string: %s\n", outputStr);
        wait(NULL);  
        exit(EXIT_SUCCESS);
    }
}