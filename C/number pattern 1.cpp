//program to print number pattern.
//the time complexity of the program is o(n).
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
			printf("%d",i);
		}
		count++;
		printf("\n");
	}
}