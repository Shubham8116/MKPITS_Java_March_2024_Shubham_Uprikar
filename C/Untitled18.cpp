//program to find the array length.
//the time complexity is o(1).
//the space complexity is o(1).
#include <stdio.h>  
  
int main() {  
    int numbers[] = {10, 20, 30, 40, 50,89,90};  
    int array_length = sizeof(numbers) / sizeof(numbers[0]);  
  
printf("The length of the 'numbers' array is: %d\n", array_length);  
  
    return 0;  
}  