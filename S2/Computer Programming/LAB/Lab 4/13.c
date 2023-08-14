#include<stdio.h>
void pf(int n){
    int f,i,j;
    for(i=2; i<=n; i++)
    {
        if(n%i==0)
        {
            f = 1;
            for(j=2; j<=i/2; j++)
            {
                if(i%j==0)
                {
                    f = 0;
                    break;
                }
            }

            /* If 'i' is Prime number and factor of num */
            if(f==1)
            {
                printf("%d\n", i);
            }
        }
    }
}
int main(){
    int n;
    printf("Enter Number: ");scanf("%d",&n);
    pf(n);
    return 0;
}
