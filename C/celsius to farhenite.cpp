//program to convert temperature.
//the time complexity of the program is o(1).
#include<stdio.h>

main() {
    

    float a, b, celsius, fahrenheit;
    int x;
    printf("Press 1 For Convert Fahrenheit To Celsius\n");
    printf("Press 2 For Convert Celsius To Fahrenheit\n");
    printf("\nEnter Your Choice: ");

    scanf("%d", & x);

    switch (x) {
    case 1:
        printf("\nEnter The Temperature in Fahrenheit: ");
        scanf("%f", & a);
        celsius = 5 * (a - 32) / 9;
        printf("\n\nCelsius Temperature is: %f ", celsius);
        break;
    case 2:
        printf("\nEnter The Temperature in Celsius: ");
        scanf("%f", & b);
        fahrenheit = ((9 * b) / 5) + 32;
        printf("\n\nFahrenheit Temperature is: %f ", fahrenheit);
        break;
    default:
        printf("\n Try Again!!!\n");
    }
    return (0);
}