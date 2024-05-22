//demo of switch case
//this program will print day of the week using given number.
//the time complexity of the program is o(1).
#include<stdio.h>
int main()
{
int day;
printf("\n Enter a number from 1 to 7");
scanf("%d",&day);
switch (day) 
   { 
      case 1: printf("Sunday");
      		break;
      case 2: printf("Monday");
	           break; 
      case 3: printf("Tuesday");
      		break;
      case 4: printf("Wednesday");
      		break; 
      case 5: printf("Thursday");
      		break;
      case 6:printf("Friday");
      		break;
      case 7:printf("Saturday");
      		break; 
      default: printf("Enter correct number");
                break;
   } 
} 