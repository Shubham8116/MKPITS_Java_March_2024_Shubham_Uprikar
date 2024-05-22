//program to demonstrate wait() and notify() method.
//requirements - item should be consumed only after it is created.
public class Main {
    public static void main(String[] args) {

        Company company=new Company();
        Consumer consumer = new Consumer(company);
        Producer producer=new Producer(company);
        producer.start();
        consumer.start();


    }
}
