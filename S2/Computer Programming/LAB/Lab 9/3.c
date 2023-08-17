#include <stdio.h>
struct Bank{
    int account_no;
    char name[20];
    int account_type;
    double balance;//0=savings & 1=current
};
void search(struct Bank *b, int key)
{
	int i, flag = 0;
	for (i = 0; i < 5; i++)
	{
		if (b[i].account_no == key)
		{
			flag = 1;
			printf("Account Exists\n");
			break;
		}
	}
	if (flag == 0)
		printf("Account does not exist!\n");
}
int main(){
    struct Bank bank[5];
    for (int i=0;i<5;i++)
	{
		printf("Enter details of %dth Account\n", i+1);
		printf("Enter the Name:");
		scanf("%s",bank[i].name);
		printf("Enter the Account_No :");
		scanf("%d", &bank[i].account_no);
		printf("Enter the Account Type :");
		scanf("%d", &bank[i].account_type);
		printf("Enter the Balance :");
		scanf("%lf", &bank[i].balance);
	}
    int key;printf("Enter acc no: ");scanf("%d",&key);
    search(bank,key);
    return 0;
}
