package data;

public class CurrentAccount extends BankAccount
{
    @Override
    void deposit() {
        System.out.println("This is currentaccount");
    }

    @Override
    void withdraw() {
        System.out.println("This is currentaccount");
    }

    @Override
    void balanceInquiry() {
        System.out.println("This is currentaccount");
    }
}
