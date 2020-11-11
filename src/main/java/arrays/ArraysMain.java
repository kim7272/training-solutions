package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysMain {
    Scanner scanner = new Scanner(System.in);

    String numberOfDaysAsString() {
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,30};
        String honapokNapjai = Arrays.toString(numberOfDays);
        return honapokNapjai;
    }
    List<String> daysOfWeek() {
        String[] nameOfDays = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        List<String> hetNapjai = Arrays.asList(nameOfDays);
        return hetNapjai;
    }
    String multiplicationTableAsString(int size){

            int[][] multi = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    multi[i][j] = (i + 1) * (j + 1);
                }
            }
            String multiTable =Arrays.deepToString(multi);
            return multiTable;
    }
    boolean sameTempValues(double[] day, double[] anotherDay){
           boolean controlEqual =  Arrays.equals(day, anotherDay);
           return controlEqual;
    }
    boolean wonLottery(int[] megtett, int[] kihuzott) {

        Arrays.sort(megtett);
            Arrays.sort(kihuzott);
            boolean b = false;
            if (Arrays.equals(megtett, kihuzott)) {
            b = true;}
            return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        System.out.println("Give me the size of the multitable!");
        int size = scanner.nextInt();
        System.out.println(arraysMain.multiplicationTableAsString(size));
        int[] megtett = new int[5];
        int[] megtettCopy = new int[5];
        int [] kihuzott = new int[5];
        int [] kihuzottCopy = new int[5];

        System.out.println("Give me the first number you have choosen!");
        megtett[0] = scanner.nextInt();
        megtettCopy[0] = megtett[0];
        scanner.nextLine();
        System.out.println("Give me the second number you have choosen!");
        megtett[1] = scanner.nextInt();
        megtettCopy[1] = megtett[1];
        scanner.nextLine();
        System.out.println("Give me the third number you have choosen!");
        megtett[2] = scanner.nextInt();
        megtettCopy[2] = megtett[2];
        scanner.nextLine();
        System.out.println("Give me the fourth number you have choosen!");
        megtett[3] = scanner.nextInt();
        megtettCopy[3] = megtett[3];
        scanner.nextLine();
        System.out.println("Give me the fifth number you have choosen!");
        megtett[4] = scanner.nextInt();
        megtettCopy[4] = megtett[4];
        scanner.nextLine();
        System.out.println("The first official lottery number:");
        kihuzott[0] = scanner.nextInt();
        kihuzottCopy[0] = kihuzott[0];
        scanner.nextLine();
        System.out.println("The second official lottery number:");
        kihuzott[1] = scanner.nextInt();
        kihuzottCopy[1] = kihuzott[1];
        scanner.nextLine();
        System.out.println("The third official lottery number:");
        kihuzott[2] = scanner.nextInt();
        kihuzottCopy[2] = kihuzott[2];
        scanner.nextLine();
        System.out.println("The fourth official lottery number:");
        kihuzott[3] = scanner.nextInt();
        kihuzottCopy[3] = kihuzott[3];
        scanner.nextLine();
        System.out.println("The fifth official lottery number:");
        kihuzott[4] = scanner.nextInt();
        kihuzottCopy[4] = kihuzott[4];
        scanner.nextLine();
        System.out.println(arraysMain.wonLottery(megtett, kihuzott));

      if (!(Arrays.equals(megtett, megtettCopy))) {
           System.out.println("Figyelem, a megtett számok eredeti sorrendje a következő volt: " + Arrays.toString(megtettCopy));
       }
      if (!(Arrays.equals(kihuzott,kihuzottCopy)))
         System.out.println("Figyelem, a kihúzott számok eredeti sorrendje a következő volt: " + Arrays.toString(kihuzottCopy));
      }
    }


