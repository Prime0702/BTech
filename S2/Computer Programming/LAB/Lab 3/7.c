//Write a program to read a hexadecimal number. Calculate and display the decimal equivalent ofthisnumber.
#include<stdio.h>
#include<math.h>
int main(){
    int l;
    printf("Enter the length of the hexadecimal number: ");
    scanf("%d",&l);
    char a[l];
    printf("Enter the hexadecimal number: ");
    scanf("%s",a);
    int i=0,dec=0;
    while (i<l){
        switch (a[l-i-1]){
            case 48:dec+=0*pow(16,i);break;
            case 49:dec+=1*pow(16,i);break;
            case 50:dec+=2*pow(16,i);break;
            case 51:dec+=3*pow(16,i);break;
            case 52:dec+=4*pow(16,i);break;
            case 53:dec+=5*pow(16,i);break;
            case 54:dec+=6*pow(16,i);break;
            case 55:dec+=7*pow(16,i);break;
            case 56:dec+=8*pow(16,i);break;
            case 57:dec+=9*pow(16,i);break;
            case 65:dec+=10*pow(16,i);break;
            case 66:dec+=11*pow(16,i);break;
            case 67:dec+=12*pow(16,i);break;
            case 68:dec+=13*pow(16,i);break;
            case 69:dec+=14*pow(16,i);break;
            case 70:dec+=15*pow(16,i);break;
        }
        i++;
    }
    printf("Decimal equivalent: %d\n",dec);
    return 0;
}