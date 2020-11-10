package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size) {
        int[][] multi = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multi[i][j] = (i + 1) * (j + 1);
            }
        }
        return multi;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("  " + a[i][j]);
            }
        }
    }

    public static int[][] triangularMatrix(int size) {
        int[][] triang = new int[size][];
        for (int i = 0; i < size; i++) {
            System.out.println();
            triang[i] = new int[i+1];
            for (int j = 0; j < i + 1; j++) {
                triang[i][j] = (i+1);
            }
        }
        return triang;
    }



    public static int[][] getValues() {
        int[][] calender = new int[12][];
        for (int i = 0; i < 12; i++) {
            calender[i] = new int [i == 0 | i == 2 | i == 4 | i == 6 ||i == 7 | i == 9 | i == 11 ? 31 : ((i != 1) ? 30 : 28)];
        }
        for (int i = 0; i < 12; i++) {
            System.out.println();
            for (int j = 0; j < calender[i].length; j++) {
                calender[i][j] = j;
            }
        }
        return calender;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the multitable!");
        int size = scanner.nextInt();
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        int[][] multitable = arrayOfArraysMain.multiplicationTable(size);

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print("  " + multitable[i][j]);}
        }
        System.out.println();
        System.out.println();


        System.out.println("Adja meg a külső tömb elemeinek a számát a nyomtatás metódushoz!");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a belső tömb elemeinek a számát a nyomtatás metódushoz!");
        int j = scanner.nextInt();
        int[][] printArrays = new int[i][j];

            for (i=0; i< printArrays.length; i++) {
                for (j=0; j< printArrays[i].length; j++) {
                    System.out.println("Give me element printArrays["+i+"]["+j+"] !");
                    printArrays[i][j] = scanner.nextInt();
                }
            }
            arrayOfArraysMain.printArrayOfArrays(printArrays);
        System.out.println();

        System.out.println("Adja meg a háromszög méretét!");
        int meret = scanner.nextInt();

        arrayOfArraysMain.printArrayOfArrays(triangularMatrix(meret));
        arrayOfArraysMain.printArrayOfArrays(getValues());


    }
}


