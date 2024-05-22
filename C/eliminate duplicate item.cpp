//program to print elements of the array by eliminating duplicate entries.
//the time complexity of the program is o(n^2).
#include<stdio.h>
#include<stdlib.h>


int main(){
 

   int output[10];

   int array[10];

   int size; 

   

   printf("please enter the 10 elements in array\n");

    for (int i=0;i<10;i++)

    {

    scanf("%d",&array[i]);

      }   

      for (int i=0;i<10;i++)
	  {

            if(array[i]==0)
                {
                      continue;
                }

            for(int j=i+1;j<10;j++)

            {
			
                if(array[i]==array[j])

                  {
                     array[j]=0;

                  }

                          
            }

}

size=0;

for (int i=0;i<10;i++)

              {

              if(array[i]!=0)

            {
			
              

             output[size]=array[i];
			 size++;                        

              }

}

for(int i=0;i<size;i++)

{
printf("%d ",output[i]);

}

}