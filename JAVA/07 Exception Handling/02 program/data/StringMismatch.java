//declaring user defined exception.
package data;

public class StringMismatch extends Exception{
    public StringMismatch(String str)
    {
        //passing message to Exception class method.
        super(str);
    }
}
