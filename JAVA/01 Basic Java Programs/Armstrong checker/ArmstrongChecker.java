//program to check given number armstrong or not
//The time complexity of this ArmstrongChecker class is O(log n)
//The space complexity of this class is O(1)
public class ArmstrongChecker {
    public void check(int a)
    {
        int  temp=a,digits=0,value=a, remainder, result = 0;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }

        while (value != 0)
        {
            remainder = value % 10;
            result += Math.pow(remainder, 3);
            value /= 10;
        }

        if(result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
    }
}
