//program to count even and odd numbers of the array.
//the time complexity of the program is o(n).
#include<stdio.h>
int main()
{
	int array[10], odd=0,even=0, value;
	
	for(int i=0;i<10;i++)
	{
		printf("\n Enter the %d element",i);
		scanf("%d",&value);
		array[i]=value;
	}
	
	for(int i=0;i<10;i++)
	{
		if(array[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	printf("\n The even count is : %d",even);
	printf("\n The odd count is: %d",odd);
	
}