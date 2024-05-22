//program to demonstrate insert,delete,display operations on array using menu driven program.
//time complexity of the  program is o(n).
#include<stdio.h>
#include<stdlib.h>

void insert(int *array)
{
	
	int value,location,size;
	
	
	printf("\n Enter the value to insert");
	scanf("%d",&value);
	printf("\n Enter the location of element to insert");
	scanf("%d",&location);
	
	
	array[location]=value;
	printf("\n The element is inserted");
   }
   

void ldelete(int *array)
{
	int value;
	int length= sizeof(array)/sizeof(array[0]);
	printf("\n Enter the value to delete");
	scanf("%d",&value);
	for(int i=0;i<10;i++)
	{
		if(array[i]==value)
		{
			array[i]=0;
			printf("\n The element is deleted");
		}
	}
}

void display(int *array)
{
	int length= sizeof(array)/sizeof(array[0]);
	for(int i=0;i<10;i++)
	{
	
	printf("\n The elements are: %d",array[i]);
	}
}


int main()
{
	int size, 
	array1[10]={};
int choice=0; 
printf("\n********* Array Operations *********\n"); 
printf("\n----------------------------------------------\n"); 
while(choice != 4) 
 { 
printf("\n\nChose one from the below options...\n"); 
printf("\n1.Insert\n2.Delete\n3.Display\n4.Exit"); 
printf("\n Enter your choice \n"); 
scanf("%d",&choice); 

switch(choice) 
 { 
case 1: 
  
       insert(array1); 
       break; 
  
case 2: 
  
       ldelete(array1); 
       break; 
  
case 3: 
  
       display(array1); 
       break; 
 
case 4: 
  		exit(0);
       printf("Exiting...."); 
       break; 
 
default: 
  
       printf("Please Enter valid choice \n "); 
 
 } 
} 

}

