//program to print prime number between two numbers .
//The time complexity of the showPrime method is O(n^2) .
// The space complexity is O(1) .
//
public class PrimeBetweenNumbers {
    public void showPrime(int start,int end)
    {
        for(int num = start;num<=end;num++){

            int count = 0;

            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    count++;
                    break;
                }
            }

            if(count==0 && num!= 1 && num!=0)
                System.out.println("the prime number is : "+num);
        }

    }
}
