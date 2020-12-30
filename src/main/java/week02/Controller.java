package week02;

import java.util.Scanner;

public class Controller {

    private Office office;
    Scanner scanner = new Scanner(System.in);

    public void readOffice(){
        Office office = new Office();
        this.office = office;
        System.out.println("Give the number of the meeting rooms!");
        int i = scanner.nextInt();
        scanner.nextLine();
        for (int j =0; j < i; j++){
            System.out.println("Name of the meeting room:");
            String name = scanner.nextLine();
            System.out.println("Length of the meeting room:");
            int length = scanner.nextInt();
            System.out.println("Width of the meeting room:");
            int width = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
        }
    }
    public void printMenu(){

        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }
    public void runMenu(){
        System.out.println("Select a menu item!");
        int k = scanner.nextInt();
        scanner.nextLine();
        if (k == 1){
        office.printNames();
        }
        if (k == 2){
            office.printNamesReverse();
        }
        if (k == 3){
            office.printEventNames();
        }
        if (k == 4){
            office.printAreas();
        }
        if (k == 5){
            System.out.println("Give me the name of the meeting room!");
            String name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        }
        if (k == 6){
            System.out.println("Give me a part of the name of the meeting room!");
            String part = scanner.nextLine();
            office.printMeetingRoomsContains(part);
        }
        if (k == 7){
            System.out.println("Give me the size of the area!");
            int area = scanner.nextInt();
            scanner.nextLine();
            office.printAreasLargerThan(area);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
