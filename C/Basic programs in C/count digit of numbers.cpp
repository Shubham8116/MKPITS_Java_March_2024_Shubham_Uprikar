//program to count the digits of the number.
//the time complexity of the program is o(log n).
#include <stdio.h>
 

int findCount(int n)
{
    int count = 0;
 
    
    
    while (n != 0) {
 
        
        count++;
        n /= 10;
    }
 
    
    return count;
}
 

int main()
{
    int n;
    printf("Enter a number");
    scanf("%d",&n);
    printf("\n Count of digits in %d = %d\n", n, findCount(n));
    return 0;
}