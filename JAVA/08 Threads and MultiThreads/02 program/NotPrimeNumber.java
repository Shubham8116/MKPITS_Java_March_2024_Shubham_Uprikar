//this program will print numbers wich are not prime upto 1000.
public class NotPrimeNumber implements Runnable{
    @Override
    public void run() {
        int i =0;
        int num =0;

        int notPrimeNumber;

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
            if (counter!=2)
            {
                notPrimeNumber=i;
                System.out.println(notPrimeNumber);
            }
        }
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

    }

}
