//Java Program to Remove Characters from the Input String which are Present in the Mask String
//Input: Enter String: Practice Java String Programs
//Enter Mask String: abc
//Output: Prtie Jv String Progrms
package programs;

public class RemoveCharacters {

   public void removeABC(String string)
   {
       StringBuilder name=new StringBuilder(string);
       StringBuffer result =new StringBuffer();
       for(int i=0;i<name.length();i++)
       {
           //System.out.println(name.charAt(i));
           if(name.charAt(i)=='a'||name.charAt(i)=='b'||name.charAt(i)=='c')
           {
               //System.out.println(name.charAt(i));
               //name.deleteCharAt(i);
               continue;
           }
           else {
               result=result.append(name.charAt(i));
           }
       }


       System.out.println(result);

   }
}
