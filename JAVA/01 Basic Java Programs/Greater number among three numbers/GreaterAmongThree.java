//program to check greater number among three numbers.
//The time complexity of this code is O(1)
//The space complexity of this code is O(1)
public class GreaterAmongThree {
    public void check(int a,int b,int c)
    {
        if (a>b && a>c)
            System.out.println("The greater number is : "+a);
        else if (b>a && b>c)
            System.out.println("The greater number is : "+b);
        else
            System.out.println("The greater number is : "+c);


    }
}
