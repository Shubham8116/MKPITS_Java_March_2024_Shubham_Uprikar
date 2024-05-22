// Java Program to Print Even Elements at Even Index Number


public class EvenElementsAtEven {
public void display(int arr[])
{
    for (int i = 0; i < arr.length; i=i+2)
    {
        if (arr[i]%2 == 0) {
            System.out.println(arr[i]);
        }
    }
}

}

