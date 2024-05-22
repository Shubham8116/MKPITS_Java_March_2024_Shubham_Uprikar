//program to find the average of n numbers.
//the time complexity of the program is o(n).
#include<stdio.h>
int main()
{
	int n,i;
	float sum=0;
	printf("Enter the Nth Term");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	printf("\n average=%f",sum/n);
}