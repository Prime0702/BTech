#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct point{
	int x;
	int y;
};
int main(){
	int n;double distance, sum = 0;
	printf("Enter the number of vertices :");scanf("%d", &n);
	struct point *p;p = (struct point *) malloc(n* sizeof(struct point *));
	for (int i=0;i<n;i++){
		printf("Enter the coordinates of the %dth vertex:", i);scanf("%d %d", &p[i].x, &p[i].y);
	}
	for (int i=0;i<n-1;i++){
		distance=sqrt(pow((p[i].x)-(p[i+1].x),2)+pow((p[i].y)-(p[i+1].y),2));
		sum=sum+distance;
	}
	sum=sum+sqrt(pow((p[n-1].x)-(p[0].x),2)+pow((p[n-1].y)-(p[0].y),2));
	printf("Sum of the Distance is %.2f", sum);
	return 0;
}
