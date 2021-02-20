package algorithmscount.bankaccounts;

import java.util.ArrayList;
import java.util.List;

public class BankAccountConditionCounter {

    private List<BankAccount> accounts = new ArrayList<>();

    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int amount){
        int count = 0;
        for (BankAccount bankAccount : accounts){
            if (bankAccount.getBalance() > amount){
                count = count + 1;
            }
        }
        return count;
    }
}
