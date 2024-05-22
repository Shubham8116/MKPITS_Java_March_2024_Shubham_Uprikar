//program to display month name based on the given number.
//the time complexity of the program is o(1).
#include<stdio.h>
int main() {
   int option;
   printf("----------- press the number to select the MONTH ---------");
   scanf("%d",&option);
   switch(option){
          case 1:printf("Its january");
                    break;
          case 2: printf("Its february");
                    break;
          case 3: printf("Its march");
                    break;
          case 4: printf("Its april");
                    break;
                    
        case 5: printf("Its may");
                    break;
        case 6: printf("Its june");
                    break;
        case 7: printf("Its july");
                    break;
        case 8: printf("Its august");
                    break;
        case 9: printf("Its september");
                    break;
        case 10: printf("Its october");
                    break;
        case 11: printf("Its november");
                    break;
        case 12: printf("Its december");
                    break;    
          
         
          default : 
                    printf("Please enter number from 1 to 12 .");
                    
                    break;
}
}