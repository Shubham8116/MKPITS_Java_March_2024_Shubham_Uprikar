//program to calculate sum of every third number.
//The time complexity of this code is O(n), where n is the number of elements in the array .

//The space complexity of this code is O(1) .
#include<stdio.h>
int main()
{
	int sum=0;
	int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	for(int i=0;i<15;i++)
	{
		i=i+2;
		sum=sum+array[i];
	}
	
	printf("The sum is %d",sum);
}