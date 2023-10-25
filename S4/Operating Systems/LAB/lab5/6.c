#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

#define PI 3.1415
void circle(float r) {
    float a, p;
    a = PI * r * r;
    p = 2 * PI * r;
    printf("Area of the circle = %.2f\n", a);
    printf("Perimeter of the circle = %.2f\n", p);
}
void square(float s) {
    float a, p;
    a = s * s;
    p = 4 * s;
    printf("Area of the square = %.2f\n", a);
    printf("Perimeter of the square = %.2f\n", p);
}
int main() {
    // Create process for circle
    float a;
    printf("Enter a: ");
    scanf("%f", &a);
    pid_t pid_c = fork();
    if (pid_c == 0) {
        circle(a);
        exit(0);
    }
    int status;
    waitpid(pid_c, &status, 0);
    // Create process for square
    pid_t pid_s = fork();
    if (pid_s == 0) {
        square(a);
        exit(0);
    }
    sleep(1);
    return 0;
}
