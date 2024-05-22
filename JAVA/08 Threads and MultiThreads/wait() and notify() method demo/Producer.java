public class Producer extends Thread{
    Company company;
    public Producer(Company company)
    {
        this.company=company;
    }
    @Override
    public synchronized void run() {

        int i=1;
        while(true)
        {

            try {
                company.produceItem(i);
                i++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
