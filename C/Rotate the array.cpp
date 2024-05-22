//program to rotate the array
//the time complexity of the program is o(n)
//the space complexity of the program is o(1)

#include<stdio.h>

int main()
{
	int array[100]={}, size;
	printf("Enter the size of the array");
	scanf("%d",&size);
	for(int i=0;i<size;i++)
	{
	
	printf("\n enter the %d element",i+1);
	scanf("%d",&array[i]);
	
	}
	int a=array[size-1];
	for(int i=size-1;i>0;i--)
	{
		array[i]=array[i-1];
	}
	array[0]=a;
	
	printf("\n The elements after rotate are:");
	for(int i=0;i<size;i++)
	{
	
	printf("%d",array[i]);
}
}