#include <stdio.h>
struct Book{
    char book_id[10];
    char book_title[10];
    char author[20];
    double price;
};
void menu(){
    printf("1. Add Book\n2. Show Books\n3. Exit\n");
    printf("Enter Choice: ");
}
void read(struct Book lib[], int *a){
    printf("Enter Book ID: ");scanf("%s",lib[*a].book_id);
    printf("Enter Book Title: ");scanf("%s",lib[*a].book_title);
    printf("Enter Author: ");scanf("%s",lib[*a].author);
    printf("Enter price: ");scanf("%d",&lib[*a].price);
    *a++;
}
void print(struct Book lib[], int *a){
    for(int i=0;i<*a;i++){
        printf("Book ID: %s\n",lib[i].book_id);
        printf("Book Title: %s\n",lib[i].book_title);
        printf("Author: %s\n",lib[i].author);
        printf("price: %d\n",lib[i].price);
    }
}
int main(){
    int a=0,ch=1;
    struct Book lib[50];
    while(ch!=3){
        menu();scanf("%d",&ch);
        if (ch==1 && a<50){read(lib,&a);a++;}
        else if(ch==1) printf("Library full.\n");
        else if(ch==2 && a>0)print(lib,&a);
        else if(ch==2) printf("No books in library.\n");
        else if(ch==3)break;
        else printf("Invalid\n");
    }
    return 0;
}
