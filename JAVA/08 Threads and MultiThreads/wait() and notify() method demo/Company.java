public class Company {
    int n;
    boolean f=false;

    public synchronized void produceItem(int n)throws InterruptedException
    {
        if(f)
        {
            //this will make other thread in waiting mode until item is produced.
            wait();
        }

        this.n=n;
        System.out.println("Item produced : "+n);
        f=true;
        notify();
    }
    public synchronized void consumeItem()throws InterruptedException
    {
        if(!f)
        {
            //this will make other thread in waiting mode until item is consumed.
            wait();
        }
        System.out.println("Item consumed: "+n);
        f=false;
        notify();
    }

}
