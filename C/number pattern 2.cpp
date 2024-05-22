//program to generate number pattern.
#include<stdio.h>
int main()
{
	int n,i,count=1;
	printf("Enter the number of lines to generate patterns \n ");
	scanf("%d",&n);
	
	for(i=0;i<=n+1;i++)
	{
		for(i=1;i<=count;i++)
		{
			printf("%d",count);
		}
		count++;
		printf("\n");
	}
}