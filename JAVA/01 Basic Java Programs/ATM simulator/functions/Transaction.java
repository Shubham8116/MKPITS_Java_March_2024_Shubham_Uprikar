//Class Transaction will host basic ATM opearations.
package functions;

public class Transaction {
    private long balance;

    public Transaction()
    {
        balance=0;
    }
    public void setBalance(long balance)
    {
        this.balance=balance;
    }
    public long getBalance()
    {
        return balance;
    }
    public void displayBalance()
    {
        System.out.println("The current balance is: "+balance);

    }
    public void depositMoney(long money)
    {
        this.balance=this.balance+money;
    }
    public void withdrawMoney(long money)
    {
        this.balance=this.balance-money;
    }
}

