package data;

public class SavingAccount extends BankAccount{
    @Override
    void deposit() {
        System.out.println("This is savingaccount");
    }

    @Override
    void withdraw() {
        System.out.println("This is savingaccount");

    }

    @Override
    void balanceInquiry() {
        System.out.println("This is savingaccount");
    }
}
