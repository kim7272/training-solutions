package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }
    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
    public int transfer(BankAccount bankAccount, int amount) {
        this.balance = this.balance - amount;
        bankAccount.balance = bankAccount.balance + amount;
        return this.balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getinfo() {
         return owner + " (" + accountNumber + "): " + balance + " Ft";
   }
}
