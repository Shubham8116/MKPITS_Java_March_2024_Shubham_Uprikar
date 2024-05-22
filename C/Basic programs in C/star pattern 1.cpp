//program to print the star pattern.
//The time complexity of this program is O(n^2) because there are two nested loops.
//The space complexity of this program is O(1) because the amount of extra space used does not increase with the input size n
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
			printf("*");
		}
		count++;
		printf("\n");
	}
}