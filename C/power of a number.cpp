//program to calculate power of a number.
//the time complexity  of the program is o(exponent)
//the space complexity of the program is o(1).
#include<stdio.h>
int main()
{
    int base, exponent;
    long long power = 1;
    int i;

   
    printf("Enter base: ");
    scanf("%d", &base);
    printf("Enter exponent: ");
    scanf("%d", &exponent);


    for(i=1; i<=exponent; i++)
    {
        power = power * base;
    }

    printf("%d ^ %d = %lld", base, exponent, power);

    return 0;
}