package array;

import java.util.Scanner;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        boolean b = false;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                 b = true;
            }
        }
                return b;
    }

    int find(int[] source, int itemToFind){
            int gotIt = -1;
            for (int i = 0; i < source.length; i++) {
                if (source[i] == itemToFind) {
                    gotIt = i;
                }
            }
                return gotIt;
    }

    public static void main (String[]args){

            ArrayHandler arrayHandler = new ArrayHandler();

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many elements will your array contain?");
            int quantity = scanner.nextInt();
            int[] numbers = new int[quantity];
            scanner.nextLine();

            for (int i = 0; i < quantity; i++) {
                System.out.println("Please give me the " + (i + 1) + ". element of your array!");
                numbers[i] = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("Which number are you looking for?");
            int search = scanner.nextInt();

            System.out.println(arrayHandler.contains(numbers, search));

            System.out.println(arrayHandler.find(numbers, search));
        }
    }

