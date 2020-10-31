package classstructureattributes;

import java.util.Scanner;

public class Music {

        public static void main(String[] args) {
            System.out.println("What is your favorite band?");
            Scanner scanner = new Scanner(System.in);
            String band = scanner.nextLine();

            System.out.println("What is the title of the best song of your favorite band?");
            String title = scanner.nextLine();

            System.out.println("What is the length of the above mentioned title?");
            int length = scanner.nextInt();

            Song song = new Song(band, title, length);

          System.out.println(song.band + " - " + song.title + " (" + song.length + " minutes)");
        }
    }

