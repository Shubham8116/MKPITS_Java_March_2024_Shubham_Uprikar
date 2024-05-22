// Demo of Anonymous class using interface Runnable

public class AnonymousRunnableDemo {
    public static void main(String[] args) {
        Runnable runnable=new Runnable()
        {
            @Override
            public void run() {
                System.out.println("hello i am in Runnable 1");
            }
        };

        Runnable runnable1=new Runnable()
        {
            @Override
            public void run() {
                System.out.println("Hello i am in Runnable 2");
            }
        };

        //Creating object of thread and passing reference of runnable
        Thread t1=new Thread(runnable);
        t1.start();
        Thread t2=new Thread(runnable1);
        t2.start();
    }
}
