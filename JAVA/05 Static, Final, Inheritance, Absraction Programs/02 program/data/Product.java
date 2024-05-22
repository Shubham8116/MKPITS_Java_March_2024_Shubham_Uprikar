package data;

public class Product {
   public static int count=0;
    public Product()
    {
//increamenting counter.
        count++;
    }
    public int getCount()
    {
        return this.count;
    }
}
