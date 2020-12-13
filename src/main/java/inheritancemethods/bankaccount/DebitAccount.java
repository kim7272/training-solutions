package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private static final double PERCENT = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public long getBalance(){
        return balance;
    }

    public void setBalance(long change){
        this.balance = this.balance - change;
    }

    public final long costOfTransaction(long amount){
        return (amount * PERCENT / 100.0) <= MIN_COST ? MIN_COST : (long) (amount * PERCENT / 100.0);
    }

    public boolean transaction(long amount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance = this.balance - amount - this.costOfTransaction(amount);
        return true;
    }

    public void balanceToZero(){balance = 0;}

}





