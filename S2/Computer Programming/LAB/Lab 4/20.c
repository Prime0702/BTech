#include <stdio.h>
int c1=1;
void ones(char *bin,int n)
{
    char oc[n+1];
    for(int i=0;i<n;i++){
        if(bin[i]=='0')oc[i]='1';
        else if(bin[i]=='1')oc[i]='0';
   }
   oc[n]='\0';
   twos(oc,n);
}
void twos(char *oc,int n)
{
    char tc[n+1];
    for(int i=n-1; i>=0; i--){
        if(oc[i] == '1' && c1 == 1){tc[i] = '0';}
        else if(oc[i] == '0' && c1 == 1){tc[i] = '1';c1 = 0;}
        else tc[i] = oc[i];
    }
    tc[n]='\0';
    printf("%s",tc);
}
int main()
{
   int n;
   printf("Enter the number of bits do you want to enter :"); scanf("%d",&n);
   char bin[n+1];
   printf("\nEnter the binary number : "); scanf("%s", bin);
   printf("\nThe twos complement of a binary number is : ");ones(bin,n);
   return 0;
}
