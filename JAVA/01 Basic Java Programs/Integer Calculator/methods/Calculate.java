//Calculator Application: Create a simple calculator program that can perform basic arithmetic operations like addition, subtraction, multiplication, and division.
package methods;

public class Calculate {
    private int num1;
    private int num2;
    private int solution;

    public int addition(int a,int b)
    {
        solution =a+b;
        return solution;
    }
    public int subtraction(int a,int b)
    {
        solution=a-b;
        return solution;
    }
    public int muiltiplication(int a,int b)
    {
        solution=a*b;
        return solution;
    }
    public int division(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Divide by zero can not be performed");
        }
        else {
            solution=a/b;

        }
        return solution;
    }

}
