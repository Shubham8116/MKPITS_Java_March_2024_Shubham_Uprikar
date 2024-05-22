//Java Program to Find the Largest and Smallest Word in a String
//Input: Enter String: String Programs in Java
//Output: The largest and smallest word is “Programs” and “in” .
package programs;

public class LargestSmallestWords {
    public void largestSmallest(String name)
    {
        String array[]=name.split(" ");
        int max=array[0].length();
        int min=array[0].length();
        String largestresult=array[0];
        String smallestresult=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i].length()>max)
            {
                max=array[i].length();
                largestresult=array[i];
            }

        }
        for (int i = 1; i <array.length ; i++) {
            if(array[i].length()<min)
            {
                min=array[i].length();
                smallestresult=array[i];
            }

        }

        System.out.println("Largest word is :"+largestresult);
        System.out.println("Smallest word is :"+smallestresult);
    }
}
