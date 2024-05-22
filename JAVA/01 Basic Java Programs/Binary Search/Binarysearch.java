//Implement a binary search algorithm in Java to search for a specific element in a sorted array of integers.
//The program should take the array and the element to search for as inputs and return the index of the element if found, or -1 if not found.
//The time complexity of binary search algorithm is O(log n) because with each comparison, the size of the array to be searched is reduced by half.
//The space complexity is O(1) because the algorithm only uses a constant amount of extra space for variables.

public class Binarysearch {

// Binary search is performed on the sorted array. The user will provide sorted array.

    public void binarySearch(int n,int []array) {

        int loc = array.length /2;
        int med=array[loc];
        if (med == n)
        {

            System.out.println("value is in the location " + (loc+1));
        }
        else if (n > med)
        {
            while (loc < array.length-1)
            {
                loc =loc + 1;
                if (array[loc] == n)
                {
                    System.out.println("Element is in the location " + (loc+1));
                }

            }
        }
        else if (n < med)
        {
            while (loc > 0)
            {
                loc =loc- 1;
                if (array[loc] == n)
                {
                    System.out.println("Element is in the location " + (loc+1));
                }
            }
        }
        else
        {
            System.out.println("Element is not found = -1");
        }
        }
    }


