//program to demonstrate Thread and its methods using Runnable interface.
import data.Example;
import data.Example2;

public class Main {
    public static void main(String[] args) {
        //creating Thread class object and passing class reference which implemented Runnable interface reference .
        Thread thread=new Thread(new Example());
        Thread thread1=new Thread(new Example2());
        //starting Thread
        //start() method will call run() method.
        thread.start();
        thread1.start();
        System.out.println(Thread.currentThread().getName());// printing thread name
        System.out.println("Id is: "+Thread.currentThread().getId());//printing thread id.
        System.out.println("this is main message");
       System.out.println(Thread.activeCount());//printing active thread numbers.
    }
}
