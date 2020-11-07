package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the hours for time_1!");
        int hours_1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me the minutes for time_1!");
        int minutes_1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me the seconds for time_1!");
        int seconds_1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Give me the hours for time_2!");
        int hours_2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me the minutes for time_2!");
        int minutes_2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me the seconds for time_2!");
        int seconds_2 = scanner.nextInt();
        scanner.nextLine();

        Time time_1 = new Time(hours_1, minutes_1, seconds_1);
        Time time_2 = new Time(hours_2, minutes_2, seconds_2);

        System.out.println("Az első időpont: " + time_1.toString() + " = " + time_1.getInMinutes() + " perc");
        System.out.println("A második időpont: " + time_2.toString() + " = " + time_2.getInSeconds() + " másodperc");

        System.out.println("Az első korábbi mint a második:  " + time_1.earlierThan(time_2));
    }
}
