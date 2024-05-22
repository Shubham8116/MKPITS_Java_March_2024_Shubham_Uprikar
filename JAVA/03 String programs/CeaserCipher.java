//Java Program to Implement Caesar Cipher
//Input: Enter the String for Encryption: Sanfoundry
//Output: vdqirxqgub

package programs;

public class CeaserCipher {
    public void encryption(String name )
    {
        int array[]=new int[30];
        int count =0;
        System.out.println(name.length());
        //codePointAt(i) method will return ascii value of that character .
        for(int i=0;i<name.length();i++)
        {
            if(name.codePointAt(i)==88||name.codePointAt(i)==89||name.codePointAt(i)==90||name.codePointAt(i)==120||name.codePointAt(i)==121||name.codePointAt(i)==122)
            {
                if(name.codePointAt(i)==88)
                {
                    array[i] = 65;
                }
                else if (name.codePointAt(i)==89)
                {
                    array[i] = 66;
                }
                else if (name.codePointAt(i)==90)
                {
                    array[i] = 67;
                }
                else if (name.codePointAt(i)==120)
                {
                    array[i] = 97;
                }
                else if (name.codePointAt(i)==121)
                {
                    array[i] = 98;
                }
                else if (name.codePointAt(i)==122)
                {
                    array[i] = 99;
                }

                count++;
            }
            else
            {

                array[i] = (name.codePointAt(i) + 3);
                count++;
            }


        }
        System.out.println();
        // displaying encrypted text.
        for (int i = 0; i <count ; i++)
        {
            char c=(char)array[i]; // converting ascii value to character  .
            System.out.print(c);
        }

    }
}
