//Simple ATM Simulator: Design a basic ATM simulator that allows users to check their balance, withdraw money, and deposit money into their account.
import functions.Transaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Transaction transaction=new Transaction();
        System.out.println("===========================================");
        System.out.println("Welcome to Shubham Bank of india");

        int choice=0;
        while(choice!=4)
        {
            System.out.println("===========================================");
            System.out.println("Press 1. Display Balance 2. Deposit Money 3. Withdraw Money 4. Exit");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1: transaction.displayBalance();
                        break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    long money= scanner.nextLong();
                    transaction.depositMoney(money);
                    System.out.println("Account updated successfully");
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    money= scanner.nextLong();
                    if(money> transaction.getBalance())
                    {
                        System.out.println("Insufficient fund");
                    }
                    else {

                        transaction.withdrawMoney(money);
                        System.out.println("Account is debited");
                    }
                    break;

                case 4:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");

            }
        }


    }
}
