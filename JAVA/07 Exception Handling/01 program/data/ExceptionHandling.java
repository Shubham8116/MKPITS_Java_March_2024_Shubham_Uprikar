// program to demonstrate Exception Handling
package data;

public class ExceptionHandling {
    public void handle()
    {
        try {
            int a = Integer.parseInt("shubham");
        }
        //catch block will catch exception
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try
        {
            String name="shubham";
            System.out.println(name.charAt(9));
        }
        //catch block will catch exception
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
