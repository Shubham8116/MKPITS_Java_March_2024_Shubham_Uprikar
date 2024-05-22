// demo of anonymous class using Thread class

public class AnonymousThreadDemo implements Runnable {
    public static void main(String[] args) {
        Thread t1=new Thread(new AnonymousThreadDemo());
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello i am shubham 1");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Hello i am shubham 2");
                    }
                }).start();
            }
        }).start();

    }

    @Override
    public void run() {
        System.out.println("Hello i am shubham");
    }
}
// output of program -
/*Hello i am shubham
Hello i am shubham 1
Hello i am shubham 2*/
