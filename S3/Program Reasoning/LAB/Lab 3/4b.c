#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    
    char s[n+1];
    scanf("%s", s);

    int c = 0, i = 0;
    while (i < n - 1) {
        if (s[i] != s[i + 1]) {
            c++;
            i++;
        }
        i++;
    }
    printf("%d\n", n - c);

    return 0;
}
