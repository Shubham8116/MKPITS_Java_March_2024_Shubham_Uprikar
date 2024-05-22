//Write a C program to calculate the sum of the first N natural numbers that are divisible by both 3 and 5.
//the time complexity of the program is o(n).
//the space complexity of the program is o(1).
#include<stdio.h>
int main()
{
	int sum=0,i,n;
	printf("Enter value of N\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%3==0 && i%5==0)
		{
			sum=sum+i;
		}
	}
	printf("\n Total sum is: %d",sum);
}