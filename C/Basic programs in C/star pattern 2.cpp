//program to print the star pattern.
//The time complexity of this program is O(n^2) because there are nested loops .

//The space complexity of this program is O(1) because it only uses a constant amount of extra space regardless of the input size.
#include <stdio.h> 
  
int main() 
{ 
    int rows = 5; 
  
     
    for (int i = 0; i < rows; i++) { 
  
        
        for (int j = 0; j < 2 * (rows - i) - 1; j++) { 
            printf(" "); 
        } 
  
        
        for (int k = 0; k < 2 * i + 1; k++) { 
            printf("* "); 
        } 
        printf("\n"); 
    } 
    return 0; 
}