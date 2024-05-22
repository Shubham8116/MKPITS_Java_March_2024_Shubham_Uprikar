//this program will print numbers wich are prime upto 1000.
public class PrimeNumber implements Runnable{
    @Override
    public void run()
    {
        int i =0;
        int num =0;

        int primeNumber;

        for (i = 1; i <= 1000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumber=i;
                System.out.println(primeNumber);
            }
        }


    }

}
