#include<stdio.h>
struct Student{
    char roll[20];
    char name[20];
    double average_mark;
};
int main(){
    int n;printf("Enter no. of stdents: ");
    typedef struct Student Stud;
    scanf("%d",&n);
    Stud Std[n];
    for(int i=0;i<n;i++){
        printf("Enter Roll no : ");scanf("%s",Std[i].roll);
        printf("Enter name    : ");scanf("%s",Std[i].name);
        printf("Enter avg mark: ");scanf("%lf",&Std[i].average_mark);
    }
    for(int i=0;i<n;i++){
        printf("Roll no : %s\n",Std[i].roll);
        printf("Name    : %s\n",Std[i].name);
        printf("Mark    : %.2lf\n",Std[i].average_mark);
    }
    return 0;
}
