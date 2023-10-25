/*@
    requires \valid(q) && \valid(r) && \seperated(q, r);
    requires y != 0;
    assigns *q, *r;
    ensures *q * y + *r == x;
    ensures *r < y;
*/
void div_rem(unsigned x, unsigned y, unsigned* q, unsigned* r){
    *q = x/y;
    *r = x%y;
}