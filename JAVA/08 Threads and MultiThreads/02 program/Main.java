// program to print prime and not prime numbers upto 1000 using threads.
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println("Program started");
        Thread t1=new Thread(new PrimeNumber());
        Thread t2=new Thread(new NotPrimeNumber());
        t1.start();
        t1.setPriority(10);// setting max priority .

        t2.start();

    }
}
