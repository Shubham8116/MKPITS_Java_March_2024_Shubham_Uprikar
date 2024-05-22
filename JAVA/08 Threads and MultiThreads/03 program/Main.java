// program to demonstrate inner classes implementing Runnable interface.
public class Main {
    public static void main(String[] args) {


    OuterInnerThread outerInnerThread=new OuterInnerThread();
    //outerInnerThread.display();
    OuterInnerThread.Inner1 inner1=outerInnerThread.new Inner1();
    Thread t1=new Thread(inner1);
    t1.start();

    OuterInnerThread.Inner2 inner2= outerInnerThread. new Inner2();
    Thread t2=new Thread(inner2);
    t2.start();
    }
}
