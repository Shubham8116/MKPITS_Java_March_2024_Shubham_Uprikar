//program to print armstrong numbers between two numbers.
//The time complexity of this program is O(n * m),
// where n is the difference between the start and end numbers and m is the number of digits in the largest number in that range.
// This is because the program iterates through each number in the range and calculates the number of digits and checks if it is an Armstrong number.
//The space complexity of this program is O(1) .
public class ArmstrongBetweenNumbers {
    public void showArmstrong(int start,int end)
    {
        for (int a =start; a <end ; a++) {

            int temp = a, digits = 0, value = a, remainder, result = 0;
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }

            while (value != 0) {
                remainder = value % 10;
                result += Math.pow(remainder, 3);
                value /= 10;
            }

            if (result == a)
                System.out.println(a + " is an Armstrong number.");

        }
    }
}
