//class Example implemented Runnable interface.
package data;

public class Example implements Runnable{
    public void run()
    {
        System.out.println("this is example class message");
        //System.out.println(Thread.activeCount());
        while (true)
        {
            System.out.println("shubham");
            try {
                // sleep method will turn current thread into waiting mode.
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
