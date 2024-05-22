//program to check given no. is odd or even
//The time complexity of this code is O(1)
//The space complexity of this code is O(1)
public class EvenOddCheck {
    public void check(long value)
    {
        if(value%10==0)
            System.out.println("It is even number");
        else
            System.out.println("It is odd number");
    }
}
