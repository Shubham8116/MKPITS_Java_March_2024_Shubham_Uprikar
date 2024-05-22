//program to demonstrate linked list opeartions.
//the time complexity of the program is depends on nodes created. so it is o(n).
#include<stdio.h>
#include<stdlib.h>
    

struct linkedlist
{
	int data;
	struct linkedlist *next;
};

struct linkedlist *head=NULL;


void display()
{
	struct linkedlist *current= head;
	if(head==NULL)
	{
		printf("List is empty\n");
	}
	else
	{
	
	while(current!=NULL)
	{
		printf("\n%d",current->data);
		current=current->next;
	}
}
}

void search()
{   int search;
    int count=1;
	printf("enter the value to search");
	scanf("%d",&search);
    struct linkedlist *current= head;
	if(head==NULL)
	{
		printf("List is empty\n");
	}
	else
	{
	
	while(current!=NULL)
	{   
	    if(current->data==search)
	    printf("\n element found at %d position",count);
		current=current->next;
		count++;
	   
	}
}	
}


	void AtEnd()
	{
	
	int value;
	printf("\n enter the node data\n");
	scanf("%d",&value);
	struct linkedlist *newnode= (struct linkedlist*)malloc(sizeof(struct linkedlist));
	newnode->data=value;
	newnode->next=NULL;
	
	if(head==NULL)
	{
		head=newnode;
	}
	else
	{
		struct linkedlist *current= head;
		while(current->next!=NULL)
		{
			current= current->next;
			
		}
		current->next= newnode;
		printf("\n The data is stored \n");
	
	}
}

void AtBeginning()
{

    int value;
	printf("\n enter the node data\n");
	scanf("%d",&value);
	struct linkedlist *newnode= (struct linkedlist*)malloc(sizeof(struct linkedlist));
	newnode->data=value;
	newnode->next=head;
	head=newnode;
	printf("\n The data is stored\n");
}

void AtPosition()
{
	int value,index,count=0;

	printf("\n enter the node data\n");
	scanf("%d",&value);
	printf("Enter the index position to insert the node");
	scanf("%d",&index);
	

	
	struct linkedlist *temp= head;
		while(temp->next!=NULL)
		{
			count++;
			temp= temp->next;
			
		}
	if(index>count||index==0)
	{
		printf("please enter correct index");
	}
	
	else if(index==1)
	{
		
	struct linkedlist *newnode= (struct linkedlist*)malloc(sizeof(struct linkedlist));
	newnode->data=value;
	newnode->next=head;
	head=newnode;
	printf("\n The data is stored\n");
		
	}
	
	else
	{	 
            struct linkedlist *current,*previous; 
            struct linkedlist *newnode= (struct linkedlist*)malloc(sizeof(struct linkedlist));
			newnode->data=value; 
            current= head; 
            for(int i=1;i<index;i++) 
           { 
            previous=current;
            current = current->next; 
            if(current == NULL) 
           { 
          printf("\ncan't insert\n"); 
          return; 
           } 
          } 
        previous ->next = newnode; 
        newnode->next=current->next; 
       printf("\nNode is inserted"); 
 }
			
			
}
			
			
			
			
			//if(index==1)
			//{
				
				//newnode->next=head;
				//head=newnode;
				//printf("\n The data is stored\n");
			//}
			
			//struct linkedlist *newnode= (struct linkedlist*)malloc(sizeof(struct linkedlist));
			//newnode->data=value;
			
	



void insert()
{   
    
    
	int choice;
	printf(" \n ---------select the position----------");
    printf("\n 1. At the end 2. At the beginning 3. At the specified position\n");
    
    
    scanf("%d",&choice);
    switch(choice)
    {
    	case 1: AtEnd();
    			break;
    	case 2: AtBeginning();
    			break;
    	case 3: AtPosition();
    			break;
	}
	



	
}

void ldelete()
{
	int value;
	printf("\n Enter the node data to delete \n");
	scanf("%d",&value);
	if(head==NULL)
	{
		printf("List is empty\n");
		return;
	}
	
	struct linkedlist *current= head;
	struct linkedlist *previous= NULL;
	
	while(current!=NULL)
	{
		
		if(current->data==value)
		{
			
			if(previous==NULL)
			{
				head=current->next;
				
			}
			else
			{
				previous->next=current->next;
				
			}
			free(current); // not compulsary
			printf("node deleted successfully");
			return;
			
		}
		
		previous=current;
		current=current->next;
	}
	
	printf("Element not found in the list."); 
}

int main()
{
	int input;
	
	while(1)
	{
		printf("\t\t\t--select the operation from the following options--\t\t\t\n --------------------------------------------------------------------------------\n 1. display linked list \n 2. Add item \n 3. delete item \n 4. search item \n 5. exit \n ----------------------------------------------------------------------------------\n");
		scanf("%d",&input);
		switch(input)
		{
			case 1: display();
				   break;
				   
			case 2: insert();
				   break;
				
			case 3: ldelete();
			        break;	   
				   
			case 4:	search();
			       break;   
			       
			case 5: exit(0);
			        break;   
					    
		    default: printf("please enter valid choice\n");
		             
		}
	}
}