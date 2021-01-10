package ioreadstring.transaction;

import classstructureintegrate.Bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();


    public void uploadListFromFile(String filePath){
        Path accounts = Path.of(filePath);
        try {
            List<String> fileInString = Files.readAllLines(accounts);
            for (String s : fileInString) {
                String[] threeElements = s.split(";",3);
                BankAccount bankAccount = new BankAccount(threeElements[0], threeElements[1], parseInt(threeElements[2]));
                accountList.add(bankAccount);
            }
        }
            catch (IOException e) {
            throw new IllegalArgumentException("Can't reach file!", e);
        }
    }

    public void makeTransactions(String filePath){
        Path transactions = Path.of(filePath);
        try {
            List<String> fileInString = Files.readAllLines(transactions);
            for (String s : fileInString){
                String[] twoData = s.split(";",2);
                for (BankAccount bankAccount : accountList){
                    if (bankAccount.getAccountNumber().equals(twoData[0])){
                        bankAccount.setBalance(Double.parseDouble(twoData[1]));
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't reach file!", e);
        }
    }

    public List<BankAccount> getAccountList(){
        return accountList;
    }

}
