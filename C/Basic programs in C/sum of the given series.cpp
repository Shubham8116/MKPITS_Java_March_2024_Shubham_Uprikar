//Develop a program to calculate the sum of the series 1/1! + 2/2! + 3/3! + ... + N/N!. 
//The time complexity of this program is O(n^2) because there is a nested loop structure.
//The space complexity of this program is O(1) .
#include<stdio.h>
int main()  
{  
    int num = 1, count;  
    float sum = 0.0, fact;  
  
    while(num <= 7)  
    {  
        fact = 1;  
        for(count = 1; count <= num; count++)  
        {  
            fact = fact * count;  
        }  
  
        sum = sum + (num / fact);  
  
        num++;  
    }  
  
    printf("Sum of series is %f\n", sum);  
  
    return 0;  
}  