#include<stdio.h>
int n,r,s;
rev(int n){
   if(n){
      r=n%10;
      s=s*10+r;
      rev(n/10);
   }
   return s;
}
int main(){
    int x;
    scanf("%d",&x);
    printf("%d",rev(x));
    return 0;
}
