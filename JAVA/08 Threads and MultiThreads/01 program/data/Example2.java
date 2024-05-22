//class Example2 implemented Runnable interface.
package data;

public class Example2 implements Runnable{
    public void run()
    {
        while(true) {
            System.out.println("sneha");
            try {
                Thread.sleep(4000);// sleep method will turn current thread into waiting mode.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
