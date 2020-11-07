package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a befektetett összeget!");
        int fund = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a kamatlábat!");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Hányadik nap után kiváncsi a hozamra?");
        int days = scanner.nextInt();

        System.out.println("Hányadik nap után szeretné kivenni a megtakarítást?");
        int days_out1 = scanner.nextInt();

        System.out.println("Hányadik nap után szeretné kivenni a megtakarítást?");
        int days_out2 = scanner.nextInt();

        System.out.println("Befektetés összege:");
        System.out.println(investment.getFund());
        System.out.println("Kamatláb:");
        System.out.println(interestRate);
        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam "+ days +" napra: " + investment.getYield(days));
        System.out.println("Kivett összeg "+ days_out1 + " nap után: "+ investment.close(days_out1));
        System.out.println("Kivett összeg "+ days_out2 + " nap után: "+ investment.close(days_out2));
    }
}
