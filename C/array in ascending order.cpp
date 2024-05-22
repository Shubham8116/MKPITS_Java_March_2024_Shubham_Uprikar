//program to sort array  in ascending order.
//time complexity of the program is O(n^2).
#include <stdio.h>    
     
int main()    
{      
    int arr[] = {50, 20, 80, 70, 10};     
    int temp = 0;    
           
    int length = sizeof(arr)/sizeof(arr[0]);    
         
    printf("Elements of original array: \n");    
    for (int i = 0; i < length; i++) {     
        printf("%d ", arr[i]);     
    }      
         
    for (int i = 0; i < length; i++) {     
        for (int j = i+1; j < length; j++) {     
           if(arr[i] > arr[j]) {    
               temp = arr[i];    
               arr[i] = arr[j];    
               arr[j] = temp;    
           }     
        }     
    }    
        
       
            
    printf("\nElements of array sorted in ascending order: \n");    
    for (int i = 0; i < length; i++) {     
        printf("%d ", arr[i]);    
    }    
    return 0;    
}     