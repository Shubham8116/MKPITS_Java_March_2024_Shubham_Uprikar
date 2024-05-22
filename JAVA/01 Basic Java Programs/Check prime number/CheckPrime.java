//program to check given number is prime or not
//The time complexity is o(n) .
//the space complexity is o(1) .
public class CheckPrime {
    public void displayPrime(int a) {

        int count = 0;
        if (a == 0 || a == 1)
        {
            System.out.println("it is not prime number");
        }
        else
        {
            for (int i = 2; i <= a / 2; i++)
            {
                if (a % i == 0)
                {
                    count++;
                    break;
                }
            }

            if (count == 0 && a != 1)
            {
                System.out.println("it is prime number");
            }
            else
            {
                System.out.println("It is not prime number");
            }
        }

    }
}