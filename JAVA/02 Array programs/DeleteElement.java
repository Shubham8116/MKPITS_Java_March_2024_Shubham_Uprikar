// program to delete element from the array and display the array.

public class DeleteElement {
public void display(int arr[],int no)
{
    int arr1[]=new int[arr.length-1];
    int j=0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=no) {
            arr1[j]=arr[i];
            j++;
        }
    }
    for (int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[i]);
    }
}
}
