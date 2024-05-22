//Java Program to Count the Number of Unique Words
//Input: Enter String: Java is great C++ is also great
//Output: Total number of unique words are 3
package programs;

public class UniqueWords {
    int x;
    public void unique(String name)
    {

        int wordcount=0;
        int resultcount=0;
        String result[]=new String[20];
        String array[]=name.split(" ");


        for (int i = 0; i < array.length; i++)
        {
            wordcount=0;
         for(int j=i+1;j< array.length;j++)
         {
             if (array[i].equalsIgnoreCase(array[j]))
             {

                 wordcount++;
                 array[j]=" ";
             }
         }
         if (wordcount==0)
         {
             result[x]=array[i];
             x++;
         }

        }

        System.out.println("The total number of unique words are : "+(x-1));
        for (int i = 0; i < x; i++) {
            System.out.println(result[i]);
        }
    }
}
