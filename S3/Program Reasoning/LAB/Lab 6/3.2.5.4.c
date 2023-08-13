#include <limits.h>
/*@
    requires INT_MIN <= *a <= INT_MAX;
    requires INT_MIN <= *b <= INT_MAX;
    requires \valid(a) && \valid(b);
    assigns \nothing;
    behavior a;
        assumes *a < *b;
        ensures \result == *b;
    behavior b:
        assumes *a >= *b;
        ensures \result == *a;
    complete behaviors;
    disjoint behaviors;
*/
int max_ptr(int* a, int *b){
    return *a < *b ? *b : *a;
}