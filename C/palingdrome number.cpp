//program to check if the given number is palingdrome or not.
//the time complexity of the program is 0(log n).
#include <stdio.h> 
  

int main() 
{ 
    
    int original,reversed = 0; 
    int num;
    printf("Enter a number\n");
    scanf("%d",&num);
    original=num;
  
    
    
  
    
    while (num != 0) { 
        int r = num % 10; 
        reversed = reversed * 10 + r; 
        num /= 10; 
    } 
  
    
    
    if (original== reversed) { 
        printf(" Given number %d is a palindrome number", 
               original); 
    } 
    else { 
        printf( 
            " Given number %d is not a palindrome number", 
            original); 
    } 
    
    return 0; 
}