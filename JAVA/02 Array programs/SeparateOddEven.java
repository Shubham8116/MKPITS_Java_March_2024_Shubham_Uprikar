
//Java Program to Separate Odd and Even Numbers from an Array .

public class SeparateOddEven {


   public void separate(int arr[]) {
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            }
            else
            {
                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("even numbers");
        for (int i = 0; i < even.length; i++) {
            if(even[i]!=0)
            System.out.println(even[i]);
        }

        System.out.println("odd numbers");
        for (int i = 0; i < odd.length; i++) {
            if(odd[i]!=0)
            System.out.println(odd[i]);
        }
    }
}