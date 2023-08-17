#include <stdio.h>
void swap(int *a, int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
void bubbleSort(int *a, int n){
    int i,j;
    for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                swap(&a[j],&a[j+1]);
            }
        }
    }
}
void MinMax( double data[], int len, double *min, double *max){
    double a[len];
    for(int i=0;i<len;i++){
        a[i]=data[i];
    }
    bubbleSort(a,len);
    *min=a[0];
    *max=a[len-1];
}
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    double a[n];
    printf("Enter the elements: ");
    for(int i=0;i<n;i++){
        scanf("%lf",&a[i]);
    }
    double min,max;
    MinMax(a,n,&min,&max);
    printf("The minimum element is: %lf\n",min);
    printf("The maximum element is: %lf",max);
    return 0;
}