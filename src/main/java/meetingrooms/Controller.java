package meetingrooms;

import java.util.Scanner;

public class  Controller {

    private Office office;

    Scanner scanner = new Scanner(System.in);

    public void readOffice(){
       int number = 0;
       String name = "";
       int length = 0;
       int width = 0;
       this.office = new Office();

        System.out.println("How many meeting rooms do you need?");
        number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++){

            System.out.println("Give me the name of meeting room " + (i+1) + " !");
            name = scanner.nextLine();
            System.out.println("Give me the width of meeting room " + (i+1) + " !");
            width = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Give me the length of meeting room " + (i+1) + " !");
            length = scanner.nextInt();
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

        int menupoint = 0;
        System.out.println("Give me the menupoint!");
        menupoint = scanner.nextInt();
        scanner.nextLine();
        if (menupoint == 1){
            office.printNames();
        }
        else if (menupoint == 2){
            office.printNamesReverse();
        }
        else if (menupoint == 3){
            office.printEventNames();
        }
        else if (menupoint == 4){
            office.printAreas();
        }

        else if (menupoint == 5){
            String name = "";
            System.out.println("Give me the name of the meeting room!");
            name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        }

        else if (menupoint == 6){
            String fragment = "";
            System.out.println("Give me the fragment of the name!");
            fragment = scanner.nextLine();
            office.printMeetingRoomsContains(fragment);
        }

        else {
            int size = 0;
            System.out.println("Give me the area!");
            size = scanner.nextInt();
            scanner.nextLine();
            office.printAreasLargerThan(size);
        }

    }

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
