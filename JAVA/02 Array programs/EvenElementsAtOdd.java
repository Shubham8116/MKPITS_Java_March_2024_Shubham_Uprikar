//Java Program to Print Even Elements at odd Index Number

public class EvenElementsAtOdd {
    public void display(int arr[])
    {
        for (int i = 1; i < arr.length; i=i+2) {
            if (arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
