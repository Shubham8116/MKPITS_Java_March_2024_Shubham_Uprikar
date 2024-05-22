//Abstract Banking System: Design an abstract class "BankAccount" with abstract methods for deposit, withdraw, and balance inquiry.
//Extend this class to create concrete classes like SavingsAccount and CurrentAccount with their specific implementation.
package data;

public abstract class BankAccount {
   abstract void deposit();
   abstract void withdraw();
   abstract void balanceInquiry();
}
