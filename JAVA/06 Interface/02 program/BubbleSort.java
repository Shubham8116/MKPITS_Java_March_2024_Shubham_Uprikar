// program will use bubble sort technique to sort given array.
//The time complexity of Bubble Sort is O(n^2) in the worst-case scenario, as it involves nested loops where each element is compared with every other element in the array.
// The space complexity is O(1) as it only requires a constant amount of extra space for temporary variables.
package data;

public class BubbleSort implements SortingAlgorithm {
    public void sort(int array[])
    {
        int temp;
        System.out.println("Array before sort :");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j])
                {
                 temp=array[j];
                 array[j]=array[i];
                 array[i]=temp;

                }

            }

        }
        System.out.println(" ");
        System.out.println("Array after sort :");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);

        }
    }
}
