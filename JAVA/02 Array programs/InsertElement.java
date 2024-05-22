//Java Program to Insert an Element in an Array .
import java.util.Arrays;

public class InsertElement {
    public void display(int no,int position, int arr[])
    {
        int n = arr.length;
        int index = position;
        System.out.println("The Original Array Before Insert: "+Arrays.toString(arr));
        Integer newArr[] = new Integer[n+1];
        int j = 0;

        for(int i = 0; i<newArr.length; i++)
        {
            if(i==index)
            {
                newArr[i] = no;
            }
            else
            {
                newArr[i] = arr[j];
                j++;
            }
        }


        System.out.println("Array after adding value: "+Arrays.toString(newArr));
    }
}


