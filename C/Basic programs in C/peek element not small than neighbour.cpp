//program to display the number not smaller than its neighbours.
//the time complexity of the program is o(n).
#include<stdio.h>

int findPeak(int arr[], int n)
{
    
    if (n == 1)
        return 0;
    if (arr[0] >= arr[1])
        return 0;
    if (arr[n - 1] >= arr[n - 2])
        return n - 1;
 
    
    for (int i = 1; i < n - 1; i++) {
 
        
        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
            return i;
    }
}
 

int main()
{
    int arr[] = { 1, 30, 20, 4, 1, 0 };
    int n = sizeof(arr) / sizeof(arr[0]);
    int show=findPeak(arr, n);
    printf("Peak element is:%d",arr[show]);
    return 0;
}
 