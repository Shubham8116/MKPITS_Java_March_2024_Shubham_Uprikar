// program to demonstrate User Defined Exception.
package data;

public class MatchString {
    public void result(String name1,String name2) throws StringMismatch
    {
        if(name1!=name2)
            throw new StringMismatch("Strings are different ");// throwing user defined exception.
    }
}
