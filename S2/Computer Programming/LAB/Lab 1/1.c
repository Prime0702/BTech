#include <stdio.h>
int main(){
    int len,wid,dep,vol;
    printf("Enter the lenght of the pool : ");
    scanf("%d",&len);
    printf("Enter the width of the pool : ");
    scanf("%d",&wid);
    printf("Enter the depth of the pool : ");
    scanf("%d",&dep);
    vol=len*wid*dep;
    printf("The volume of the pool is %d cubic feet.\n",vol);
    return 0;
}