//program to demonstrate stack using array.
//The time complexity of the push and pop operation in this stack implementation using an array is O(1).
//The space complexity of this implementation is O(n) where n is the size of the stack. 
#include <stdio.h>
int stack[100];
int choice=0;
int size;
int top=-1; 

void push(); 
void pop(); 
void show(); 

int main () 
{ 
printf("Enter the number of elements in the stack "); 
scanf("%d",&size); 

printf("\n*********Stack operations using array*********"); 
printf("\n----------------------------------------------\n"); 

while(choice != 4) 
 { 
printf("\nChose one from the below options...\n"); 
printf("\n1.Push\n2.Pop\n3.Show\n4.Exit\n"); 
printf("\n Enter your choice \n"); 
scanf("%d",&choice); 

switch(choice) 
 { 
case 1: 
  
       push(); 
       break; 
  
 
case 2: 
  
       pop(); 
       break; 
  
 
case 3: 
  
       show(); 
       break; 
 
  
case 4: 
  
       printf("Exiting...."); 
       break; 
  
 
default: 
  
       printf("Please Enter valid choice "); 
 
  
 } 
 
 } 
} 

void push () 
{ 
int data; 
if (top == size ) 
printf("\n Overflow"); 

else
 { 
printf("Enter the value?"); 
scanf("%d",&data); 

top = top +1; 
printf("%d",top);
stack[top] = data; 
 } 
 
} 

void pop () 
{ 
if(top == -1) 
{
printf("Underflow"); 
}
else
{
top = top -1; 
printf("\n Item is deleted");
}
} 

void show() 
{ 
if(top == -1) 
 { 
printf("Stack is empty"); 
}
else
{
for (int i=top;i>=0;i--) 
 { 
printf("\n Item NO. %d",i);
printf("\t %d",stack[i]);
 } 
}
}