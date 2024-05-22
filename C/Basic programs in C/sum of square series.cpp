//program for the sum of square series.

//the time complexity of this program is O(n) because there is a single loop that iterates from 1 to n. 
//The space complexity is O(1) .

#include<stdio.h>

int main(){

    int n,i;
    int sum=0;

    printf("Enter the n i.e. max values of series: ");
    scanf("%d",&n);

    sum = (n * (n + 1) * (2 * n + 1 )) / 6;

    printf("Sum of the series : ");

    for(i =1;i<=n;i++){
         if (i != n)
             printf("%d^2 + ",i);
         else
             printf("%d^2 = %d ",i,sum);
    }

    return 0;
}