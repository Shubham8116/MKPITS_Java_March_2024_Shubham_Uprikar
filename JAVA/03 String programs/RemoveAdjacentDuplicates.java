//Java Program to Remove All Adjacent Duplicates from String
//Input: String: ABBCCCD
//Output: ACD
package programs;

public class RemoveAdjacentDuplicates {

    public void removeDuplicates(String name)
    {
        StringBuffer result =new StringBuffer(name);

        for (int i = 1; i < result.length()-1; i++) {
           if (result.charAt(i)==result.charAt(i-1)||result.charAt(i)==result.charAt(i+1))
           {
               result.deleteCharAt(i);
               System.out.println(result);
           }


        }
        System.out.println(result);

    }
}
