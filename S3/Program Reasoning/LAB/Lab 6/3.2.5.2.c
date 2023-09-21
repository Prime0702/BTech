/*@
    requires \valid(a) && \valid(b) && \separated(a, b);
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
//@ assigns \nothing;
int main(){
    int a = 5;
    int x = 0;
    reser_1st_if_2nd_is_true(&a, &x);
    //@ assert a == 5;
    //@ assert x == 0;

    int const b = 1;
    reser_1st_if_2nd_is_true(&a, &b);
    //@ assert a == 0;
    //@ assert b == 1;
}