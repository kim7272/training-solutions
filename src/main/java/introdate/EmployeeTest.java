package introdate;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dolgozó neve:");
        String name = scanner.nextLine();
        System.out.println("Dolgozó születési éve:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dolgozó születési hónapja:");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dolgozó születési napja:");
        int day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Dolgozó belépésének időpontja: " + employee.getBeginEmployment(LocalDateTime.now()));
        System.out.println("Dolgozó neve: "+ employee.getName());
        System.out.println("Dolgozó születési dátuma: "+ employee.getDateOfBirth());
    }
}
