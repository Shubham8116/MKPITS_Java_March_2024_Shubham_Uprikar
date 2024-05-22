//program to calculate the sum of big 4 and sum of small 4 numbers in the given array.
//The time complexity of this program is O(n^2) because there are two nested loops used for sorting the array elements. 
//The space complexity is O(n) because two arrays of size 10 are used to store the input and sorted elements.
#include<stdio.h>
int main()
{

int array[10],sorted[10], big, small, value,sumlarge=0,sumsmall=0;
	
	for(int i=0;i<10;i++)
	{
		printf("\n Enter the %d element",i);
		scanf("%d",&value);
		array[i]=value;
	}
	
	for (int i = 0; i < 10; ++i) 
        {
 
            for (int j = i + 1; j < 10; ++j)
            {
 
                if (array[i] > array[j]) 
                {
 
                    big =  array[i];
                    array[i] = array[j];
                    array[j] = big;
 
                }
 
            }
        }
		
		for(int i=0;i<10;i++)
	{
		printf("\n the %d element is",i);
		printf("\t %d",array[i]);
		
	}
	
	sumsmall=array[0]+array[1]+array[2]+array[3];
	sumlarge=array[9]+array[8]+array[7]+array[6];
	
	printf("The sum of largest 4 numbers is %d",sumlarge);
	printf("The sum of smallest 4 numbers is %d",sumsmall);
	
	
}