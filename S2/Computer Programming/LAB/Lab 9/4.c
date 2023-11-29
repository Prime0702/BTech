#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct employee{int empno;char emp_name[30];char position[30];int basic_pay;};
void read(struct employee *a, int n){
	int i;for (i = 0; i < n; i++){
		printf("Enter the details of %dth Employee\n", i);
		printf("Enter Position:");fgets(a[i].position,30,stdin);
		printf("Enter Employee Name:");fgets(a[i].emp_name,30,stdin);
		printf("Enter Employee Number:");scanf("%d", &a[i].empno);
		printf("Enter Basic pay:");scanf("%d", &a[i].basic_pay);}}
void display(struct employee *a, int n){
	for (int i=0;i<n;i++){
		printf("The Details of %dth Employee\n", i);
		printf("Employee Number : %d\nName : %s\nEmployee Postion : %s\nBasic Pay : %d\n", a[i].empno, a[i].emp_name, a[i].position, a[i].basic_pay);}}
void search(struct employee *a, int n){
    int i,c,num,pay;char name[30],pos[30];
    printf("Enter the choice to use for search from the following\n,1. Employee Name\n2. Employee Position\n3. BasicPay\n4. Employee Number\n");
    scanf("%d",&c);
    switch(c){
        case 1:
            printf("Enter the Employee Name to be searched\n");scanf("%s",name);
            for(i=0;i<n;i++){if(strcmp(a[i].emp_name,name)==0)
                printf("Employee Details :\nEmployee Name : %s\nEmployee Position : %s\nEmployee Number : %d\nBasic Pay : %d",a[i].emp_name,a[i].position,a[i].empno,a[i].basic_pay);}break;
        case 2:
            printf("Enter the Employee Position to be searched\n");scanf("%s",pos);
            for(i=0;i<n;i++){if(strcmp(a[i].position,pos)==0)
                printf("Employee Details :\nEmployee Name : %s\nEmployee Position : %s\nEmployee Number : %d\nBasic Pay : %d",a[i].emp_name,a[i].position,a[i].empno,a[i].basic_pay);}break;
        case 3:
            printf("Enter the Basic Pay to be searched\n");scanf("%d",&pay);
            for(i=0;i<n;i++){if(0 <= a[i].basic_pay && a[i].basic_pay <= pay)
                printf("Employee Details :\nEmployee Name : %s\nEmployee Position : %s\nEmployee Number : %d\nBasic Pay : %d",a[i].emp_name,a[i].position,a[i].empno,a[i].basic_pay);}break;
        case 4:
            printf("Enter the Employee Number to be searched\n");scanf("%d",&num);
            for(i=0;i<n;i++){if(a[i].empno==num)
                printf("Employee Details :\nEmployee Name : %s\nEmployee Position : %s\nEmployee Number : %d\nBasic Pay : %d",a[i].emp_name,a[i].position,a[i].empno,a[i].basic_pay);}break;
        default:
            printf("Enter a correct choice\n");break;}}
int main(){
	int n;printf("Enter the number of Employees: ");scanf("%d", &n);
	struct employee a[n];read(a, n);display(a, n);search(a, n);return 0;
}
