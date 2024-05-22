//program to sort tha array in dscending order.
//the time complexity is o(n^2).
//the space complexity is o(1).
#include<stdio.h>
int main()
{

int array[10], big, small, value;
	
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
 
                if (array[i] < array[j]) 
                {
 
                    small =  array[i];
                    array[i] = array[j];
                    array[j] = small;
 
                }
 
            }
        }
		
		for(int i=0;i<10;i++)
	{
		printf("\n the %d element is",i);
		printf("\t %d",array[i]);
		
	}
}