#include <stdio.h>

int main() {
    int n, x, y;
    scanf("%d", &n);
    scanf("%d %d", &x, &y);
    
    if (x + y > n + 1) {
        printf("Black\n");
    } else {
        printf("White\n");
    }

    return 0;
}
