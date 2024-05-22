//Java Program to Increment All Elements of an Array by One

public class IncreamentElements {
public void increament(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
        arr[i]=arr[i]+1;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
