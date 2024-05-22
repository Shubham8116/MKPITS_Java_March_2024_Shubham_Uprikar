//Menu Driven program in C implementing all the stack operations using linked list
//the time complexity of the push and display function is o(n) and for the pop operation is o(1).
//the space complexity of the program is o(1) because it only uses a constant amount of extra space for the variables and pointers created within the function.

#include <stdio.h>
#include <stdlib.h>

void push(); 
void pop(); 
void display(); 

struct node 
{ 
int val; 
struct node *next; 
};
 
struct node *head;
 
int main () 
{ 
int choice=0; 
printf("\n*********Stack operations using linked list*********\n"); 
printf("\n----------------------------------------------\n"); 
while(choice != 4) 
 { 
printf("\n\nChose one from the below options...\n"); 
printf("\n1.Push\n2.Pop\n3.Display\n4.Exit"); 
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
  
       display(); 
       break; 
 
case 4: 
  
       printf("Exiting...."); 
       break; 
 
default: 
  
       printf("Please Enter valid choice \n "); 
 
 } 
} 

} 

void push () 
{ 
int val; 
struct node *current = (struct node*)malloc(sizeof(struct node)); 
if(current == NULL) 
 { 
printf("not able to push the element \n"); 
 } 
else
 { 
printf("Enter the Data \n"); 
scanf("%d",&val); 
if(head==NULL) 
 { 
current->val = val; 
current -> next = NULL; 
head=current; 
 } 
else
 { 
current->val = val; 
current->next = head; 
head=current; 
 } 
printf("Item pushed \n"); 
 } 
} 
void pop() 
{ 
int item; 
struct node *current; 
if (head == NULL) 
 { 
printf("Underflow \n"); 
 } 
else
 { 
item = head->val; 
current = head; 
head = head->next; 
free(current); 
printf("Item popped \n"); 
 } 
} 
void display() 
{ 
int i; 
struct node *current; 
current=head; 
if(current == NULL) 
 { 
printf("Stack is empty\n"); 
 } 
else
 { 
printf("Printing Stack elements \n"); 
while(current!=NULL) 
 { 
printf("%d\n",current->val); 
current = current->next; 
 } 
 } 
}