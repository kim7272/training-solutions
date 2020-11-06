package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First account number?");
        String accountNumber1 = scanner.nextLine();
        System.out.println("Name of the owner of the first account?");
        String owner1 = scanner.nextLine();
        System.out.println("Balance of the first account?");
        int balance1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Second account number?");
        String accountNumber2 = scanner.nextLine();
        System.out.println("Name of the owner of the second account?");
        String owner2 = scanner.nextLine();
        System.out.println("Balance of the second account?");
        int balance2 = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount1 = new BankAccount(accountNumber1, owner1, balance1);
        BankAccount bankAccount2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println("How much would you like to deposit on the first account?");
        int amount1_dep = scanner.nextInt();
        bankAccount1.deposit(amount1_dep);
        System.out.println("The new balance of the first account is:");
        System.out.println(bankAccount1.getinfo());

        System.out.println("How much would you like to deposit on the second account?");
        int amount2_dep = scanner.nextInt();
        bankAccount2.deposit(amount2_dep);
        System.out.println("The new balance of the second account is:");
        System.out.println(bankAccount2.getinfo());

        System.out.println("How much would you like to withdraw from the first account?");
        int amount1_with = scanner.nextInt();
        bankAccount1.withdraw(amount1_with);
        System.out.println("The new balance of the first account is:");
        System.out.println(bankAccount1.getinfo());

        System.out.println("How much would you like to withdraw from the second account?");
        int amount2_with = scanner.nextInt();
        bankAccount2.withdraw(amount2_with);
        System.out.println("The new balance of the second account is:");
        System.out.println(bankAccount2.getinfo());

        System.out.println("How much would you like to transfer from the first to the second account?");
        int transfer_1_to_2 = scanner.nextInt();
        System.out.println("The new balance of the first account after the transfer is: " + bankAccount1.transfer(bankAccount2, transfer_1_to_2) + " Ft");
        System.out.println("The new balance of the second account after the transfer is: " + bankAccount2.getBalance()+" Ft");

        System.out.println("How much would you like to transfer from the second to the first account?");
        int transfer_2_to_1 = scanner.nextInt();
        System.out.println("The new balance of the second account after the transfer is: " + bankAccount2.transfer(bankAccount1, transfer_2_to_1)+" Ft");
        System.out.println("The new balance of the first account after the transfer is: " + bankAccount1.getBalance()+" Ft");















    }
}