#include <stdio.h>


//program to calculate body mass index.
//the time complexity of the program is o(1).

void BMI(int, float);

int main() 
{
int w; 
float h; 

    
printf("Input the weight: ");
scanf("%d", &w);
printf("Input the height: ");
scanf("%f", &h);

    
BMI(w, h);
}


void BMI(int weight, float height) {
    
float temp = weight / (height * height);

    
printf("BMI = %f\n", temp);
printf("\nGrade: ");

    
temp< 18.5 ? printf("Under ") : temp < 25 ? printf("Normal ") : temp < 30 ? printf("Over ") : temp < 40 ? printf("Obese ") : printf("Error");
}
