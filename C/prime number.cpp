//program to calculate prime number upto range given.
//the time complexity of the program is o(n^2).
//the space complexity of the program is o(1).


#include<stdio.h>

int main(){

    int num,i,count,n;
    printf("Enter max range: ");
    scanf("%d",&n);

    for(num = 1;num<=n;num++){

         count = 0;

         for(i=2;i<=num/2;i++){
             if(num%i==0){
                 count++;
                 break;
             }
        }
        
         if(count==0 && num!= 1 && num!=0)
             printf("%d ",num);
    }
  
   return 0;
}