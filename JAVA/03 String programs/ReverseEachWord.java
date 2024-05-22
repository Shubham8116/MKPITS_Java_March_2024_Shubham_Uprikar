//Java Program to Reverse Each Word in a String
//Input: String: Java Programs on String
//Output: avaj smargorp no gnirts
package programs;

public class ReverseEachWord {
    public void reverse(String input)
    {
        // using StringBuffer class we can implement reverse method.
        StringBuffer name=new StringBuffer(input);
        name.reverse();
        System.out.println(name);

        String result[]=name.toString().split(" ");
        for (int i = result.length-1; i >=0 ;i--) {
            System.out.print(result[i]);
            System.out.print(" ");

        }

    }
}
