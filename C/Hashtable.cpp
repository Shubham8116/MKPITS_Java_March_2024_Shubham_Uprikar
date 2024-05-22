//program to demonstrate basic hash indexing using %10 rule.
//the time complexity of the program is 0(n).
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int array[10];
	int value, hash;
	printf("Please enter the 10 numbers\n");
	for(int i=0;i<10;i++)
	{
		printf("\n Enter the %d element\t",i);
		scanf("%d",&value);
		hash=value%10;
		printf("the hash value is: %d",hash);
		array[hash]=value;
		
	}
	printf("\nThe elements are:");
	for(int i=0;i<10;i++)
	{
		
		printf("\n %d",array[i]);
	}
}