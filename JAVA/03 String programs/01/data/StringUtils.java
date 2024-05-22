//creating String utility class having methods
//to convert String into uppercase
//to match a given String
//to reverse a String.
package data;

public class StringUtils {

    public static void reverseString(String name)
    {
        StringBuilder string= new StringBuilder(name);
        System.out.println("The reverse of string "+name+" is --  "+string.reverse());
    }

    public static void toUppercase(String name)
    {
        System.out.println("After converting to upeercase , the result is: "+name.toUpperCase());

    }

    public static void countSubstring(String name,String substring)
    {
        int count=0;

        String []array= name.split(" ");
        for (int i = 0; i < array.length ; i++)
        {
            if(substring.equals(array[i]))
            {
                count++;
            }

        }

        System.out.println("The occurances of substring is :"+count);

    }
}
