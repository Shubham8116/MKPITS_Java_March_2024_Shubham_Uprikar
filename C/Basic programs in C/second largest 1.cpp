//program to find the largest and second largest element from the array.
//the time complexity of the program is o(n).
//the space complexity of the program is o(1).
#include<stdio.h>
int main() {
   int array[10] = {101, 11, 3, 4, 50, 69, 7, 8, 9, 0};
   int loop, largest, second;

   if(array[0] > array[1]) {
      largest = array[0];
      second  = array[1];
   } else {
      largest = array[1];
      second  = array[0];
   }

   for(loop = 2; loop < 10; loop++) {
      if( largest < array[loop] ) {
         second = largest;
         largest = array[loop];
      } else if( second < array[loop] ) {
         second =  array[loop];
      }
   }

   printf("Largest - %d \nSecond - %d \n", largest, second);   

   return 0;
}