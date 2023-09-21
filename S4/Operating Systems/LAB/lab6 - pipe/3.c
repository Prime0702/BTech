#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    int parent_to_child1[2]; 
    int parent_to_child2[2]; 
    int child1_to_parent[2]; 
    int child2_to_parent[2];

    if (pipe(parent_to_child1) == -1 || pipe(parent_to_child2) == -1 ||
        pipe(child1_to_parent) == -1 || pipe(child2_to_parent) == -1) {
        perror("Pipe creation failed");
        exit(1);
    }

    pid_t child1_pid, child2_pid;
    child1_pid = fork();

    if (child1_pid == -1) {
        perror("Child1 fork failed");
        exit(1);
    } else if (child1_pid == 0) {
        
        close(parent_to_child1[1]); 
        close(child1_to_parent[0]); 

        int sum = 0;
        int num;

        while (read(parent_to_child1[0], &num, sizeof(num)) > 0) {
            if(num==-1){
                    break;
                }
            sum += num*num;
        }

        close(parent_to_child1[0]); 

        write(child1_to_parent[1], &sum, sizeof(sum)); 
        close(child1_to_parent[1]); 

        exit(0);
    } else {
        child2_pid = fork();

        if (child2_pid == -1) {
            perror("Child2 fork failed");
            exit(1);
        } else if (child2_pid == 0) {
            
            close(parent_to_child2[1]); 
            close(child2_to_parent[0]); 

            int count = 0;
            int num;

            while (read(parent_to_child2[0], &num, sizeof(num)) > 0) {
                if(num==-1){
                    break;
                }
                count++;
            }

            close(parent_to_child2[0]); 

            write(child2_to_parent[1], &count, sizeof(count)); 
            close(child2_to_parent[1]); 

            exit(0);
        } else {
           
            close(parent_to_child1[0]);
            close(parent_to_child2[0]);
            close(child1_to_parent[1]); 
            close(child2_to_parent[1]);

            int num;
            char special_char;

            printf("Enter numbers (enter a special character to exit): ");

            while (scanf("%d", &num) == 1) {
                
                write(parent_to_child1[1],&num, sizeof(num)); 
                write(parent_to_child2[1], &num, sizeof(num)); 
                if(num==-1){
                    break;
                }
                
            }

            close(parent_to_child1[1]); 
            close(parent_to_child2[1]); 

            wait(NULL);
            wait(NULL);

            int sum, count;
            read(child1_to_parent[0], &sum, sizeof(sum)); 
            read(child2_to_parent[0], &count, sizeof(count)); 

            close(child1_to_parent[0]); 
            close(child2_to_parent[0]); 

            float mean = (float)sum / count;

            printf("Mean of the square of numbers: %.2f\n", mean);

            exit(0);
        }
    }

    return 0;
}