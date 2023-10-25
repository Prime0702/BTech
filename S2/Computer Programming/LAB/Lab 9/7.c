#include <stdio.h>
#include <stdlib.h>
#include <math.h>
typedef struct CashRegister{
	int tens;int fives;int ones;
}CashRegister;
void Init(CashRegister *cr, int tens, int fives, int ones){
	printf("Enter the Nno of 10,5,1:");
	scanf("%d %d %d", &cr->tens, &cr->fives, &cr->ones);
}
void add_notes(CashRegister *cr, int tens, int fives, int ones){
	int add_t, add_f, add_o = 0;
	printf("Number of 10,5,1 added :");
	scanf("%d %d %d", &add_t, &add_f, &add_o);
	cr->tens = cr->tens + add_t;cr->fives = cr->fives + add_f;
	cr->ones = cr->ones + add_f;
}
void remove_notes(CashRegister *cr, int tens, int fives, int ones){
	int sub_t, sub_f, sub_o = 0;
	printf("Removed 10,5,1 :");
	scanf("%d %d %d", &sub_t, &sub_f, &sub_o);
	cr->tens = cr->tens - sub_t;cr->fives = cr->fives - sub_f;
	cr->ones = cr->ones - sub_o;
}
int value(CashRegister *cr, int *t, int *f, int *o)
{*t = 10 *(cr->tens);*f = 5 *(cr->fives);*o = 1 *(cr->ones);return 0;}
void inventory(CashRegister *cr)
{
	int t, f, o = 0;value(cr, &t, &f, &o);
	printf("10:%d\n5:%d\n1:%d\n", t, f, o);
}
int main()
{
	CashRegister *c;int t, f, o, total = 0;	Init(c, c->tens, c->fives, c->ones);
	add_notes(c, c->tens, c->fives, c->ones);remove_notes(c, c->tens, c->fives, c->ones);
	value(c, &t, &f, &o);total = t + f + o;printf("Total:%d\n", total);inventory(c);
	return 0;
}
