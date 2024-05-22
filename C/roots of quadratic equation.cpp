//to find the roots of the quadratic equation.
//the space complexity of the program is o(1).
//the time complexity of the program is o(1).
#include <stdio.h>
#include <math.h>

int main() {
double a, b, c, root1, root2, discriminant;

printf("Enter coefficients a, b, and c: ");
scanf("%lf %lf %lf", &a, &b, &c);


discriminant = b * b - 4 * a * c;

if (discriminant > 0) {
root1 = (-b + sqrt(discriminant)) / (2 * a);
root2 = (-b - sqrt(discriminant)) / (2 * a);
printf("Roots are real and distinct.\n");
printf("Root 1 = %.2lf\n", root1);
printf("Root 2 = %.2lf\n", root2);

} else if (discriminant == 0) {
root1 = -b / (2 * a);
printf("Roots are real and same.\n");
printf("Root 1 = Root 2 = %.2lf\n", root1);

} else {
double realPart = -b / (2 * a);
double imaginaryPart = sqrt(-discriminant) / (2 * a);
printf("Roots are complex and different.\n");
printf("Root 1 = %.2lf + %.2lfi\n", realPart, imaginaryPart);
printf("Root 2 = %.2lf - %.2lfi\n", realPart, imaginaryPart);}

return 0;
}