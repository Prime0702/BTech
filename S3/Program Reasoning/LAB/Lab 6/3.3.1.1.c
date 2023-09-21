#include <limits.h>
/*@
    requires a < b ==> b-a <= INT_MAX;
    requires b <= a ==> a-b <= INT_MAX;
    assigns \nothing;
    behavior inf:
        assumes a < b;
        ensures a + \result == b;
    behavior sup:
        assumes b <= a;
        ensures a - \result == b;
    complete behaviors;
    disjoint behaviors;
*/
int distance(int a, int b){
    if (a < b){
        return b-a;
    } else {
        return a-b;
    }
}
/*@
    requires \valid(a) && \valid_read(b) && \separated(a, b);
    assigns *a;
    ensures *b == \old(*b);
    behavior true:
        assumes *b;
        ensures *a == 0;
    behavior false:
        assumes !*b;
        ensures *a == \old(*a);
    complete behaviors;
    disjoint behaviors;
*/
void reser_1st_if_2nd_is_true(int *a, int const* b){
    if (*b)
        *a = 0;
}
/*@
    requires 1 <= month <= 12;
    assigns \nothing;
    behavior february:
        assumes month \in { 2 };
        ensures \result == 28;
    behavior thirty:
        assumes month \in { 4, 6, 9, 11 };
        ensures \result == 30;
    behavior thirty_one:
        assumes month \in { 1, 3, 5, 7, 8, 10, 12 };
        ensures \result == 31;
    complete behaviors;
    disjoint behaviors;
*/
int day_of(int month){
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    return days[month-1];
}
/*@
    requires \valid(a) && \valid(b);
    assigns *a, *b;
    behavior reorder:
        assumes *a < *b;
        ensures *a == \old(*b) && *b == \old(*a);
    behavior keep:
        assumes *a >= *b;
        ensures *a == \old(*a) && *b == \old(*b);
    complete behaviors;
    disjoint behaviors;
*/
void max_ptr(int* a, int *b){
    if (*a < *b){
        int tmp = *b;
        *b = *a;
        *a = tmp;
    }
}