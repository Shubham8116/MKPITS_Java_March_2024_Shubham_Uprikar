//Count Pairs of elements whose sum matches with the given sum.
//the time complexity of the program is o(n^2).
#include<stdio.h>
int main()
{
	int array[10]={},i,j,n,sum,count=0;
	printf("enter the total elements number");
	scanf("%d",&n);
	printf("\n enter the sum to check pairs");
	scanf("%d",&sum);
	
	for(i=0;i<n;i++)
	{
		printf("\n Enter the %d element",i);
		scanf("%d",&array[i]);
		
	}
	printf("\n The pairs are :");
	
    for(i=0;i<n;i++)
	{
				
		for(j=i+1;j<n;j++)
		{
			if(array[i]+array[j]==sum)
			{
				printf("\t %d and %d",array[i],array[j]);
				count++;
			}
			
		}
	}
	if(count>0)
	{
	printf("\n The count is :%d",count)	;
	}
	else
	{
		printf("\n sorry no pairs are found :");
	}
}