//Java Program to Find Maximum Difference Between Two Elements in an Array

public class MaxDifferenceBetweenElements {
    public void display(int arr[])
    {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println("The max difference between two elements is: "+(arr[0]-arr[7]));

    }

}
