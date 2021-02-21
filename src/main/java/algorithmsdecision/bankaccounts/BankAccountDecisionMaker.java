package algorithmsdecision.bankaccounts;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDecisionMaker {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int amount){

        for (BankAccount bankAccount : accounts){
            if (bankAccount.getBalance() > amount){
                return true;
            }
        }
        return false;
    }
}

