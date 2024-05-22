// demo of outer inner class by implementing Runnable interface

public class OuterInnerThread {
    //inner class 1.
    public class Inner1 implements Runnable
    {
        // implementing run() method of Runnable interface.
        @Override
        public void run() {
            System.out.println("shubham is good");
        }
    }
    //inner class 2.
    public class Inner2 implements Runnable
    {
        // implementing run() method of Runnable interface.
        @Override
        public void run() {
            System.out.println("shubham is bad");

        }
    }

    public void display()
    {

        Thread t1=new Thread(new Inner1());
        t1.start();
        Thread t2=new Thread(new Inner2());
        t2.start();
    }
}
