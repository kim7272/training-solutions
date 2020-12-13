package inheritancemethods.bankaccount;

public class CreditAccount extends  DebitAccount{

    private long overdraftLimit;
    private static final double COST = - 3.0;
    private static final long MIN_COST = - 200;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(long change){
        this.overdraftLimit = this.overdraftLimit - change;
    }


    @Override
    public boolean transaction (long amount){
        if (amount > super.getBalance() + this.overdraftLimit) {
            return false;
        }
        else if (amount < super.getBalance()){
            super.setBalance(amount + super.costOfTransaction(amount));
            return true;
        }
        else {
            this.setOverdraftLimit(amount + super.costOfTransaction(amount) - super.getBalance());
            super.balanceToZero();
            return true;
        }
    }
}

