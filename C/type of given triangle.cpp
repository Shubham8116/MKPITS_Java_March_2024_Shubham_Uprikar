//program to find the type of a given triangle.
//The time complexity of this program is O(1) .
//The space complexity is also O(1) because the program only uses a constant amount of memory . 
#include<stdio.h>
int main(){
   int side1, side2, side3;
   printf("Enter sides of triangle:");
   scanf("%d%d%d",&side1,&side2,&side3);
   if(side1 == side2 && side2 == side3)
      printf("The Given Triangle is equilateral");
   else if(side1 == side2 || side2 == side3 || side3 == side1)
      printf("The given Triangle is isosceles");
   else
      printf("The given Triangle is scalene");
   return 0;
}