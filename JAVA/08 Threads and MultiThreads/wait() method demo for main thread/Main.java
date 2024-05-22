//this program will execute child thread first then it will execute main thread.
public class Main {
    public static  void main(String[] args) throws InterruptedException {

        YourThread yourThread=new YourThread();
        //creating synchronised block
synchronized (yourThread)
{
    yourThread.start();
    yourThread.wait();
}

        System.out.println("the main sum is : "+yourThread.sum);



    }
}
