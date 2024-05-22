//program to calculate factorial of the given number.
//The time complexity of the displayFact method is O(n) .
//The space complexity is O(1) .
public class Factorial {
    public void displayFact(int a)
    {
        if(a==0)
        {System.out.println("The factorial is : 1");}
        else {
            long fact = 1;
            long i;
            for (i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of the number is :"+fact);
        }
    }
}
