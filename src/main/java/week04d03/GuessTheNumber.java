package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private int randomNumber;
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    public GuessTheNumber() {
        this.randomNumber = random.nextInt(100) + 1;
    }

    public void guessGame(){

        System.out.println("Random number is: "+ randomNumber);
        for (int i = 0; i < 6; i++){
            int yourNumber;
            System.out.println("Give me your number!");
            yourNumber = scanner.nextInt();
            if (yourNumber < randomNumber){
                System.out.println("Your number is smaller than the random number!");
            }
            else if (yourNumber > randomNumber){
                System.out.println("Your number is bigger than the random number!");
            }
            else {
                System.out.println("Your number is equal to the random number!");
            }
        }
        System.out.println("Pal, you have already tried six times, game over!");
    }

    public static void main(String[] args) {

        new GuessTheNumber().guessGame();

    }
}
