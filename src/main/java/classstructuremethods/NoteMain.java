package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        note.setName(scanner.nextLine());

        System.out.println("What is the topic?");
        note.setTopic(scanner.nextLine());

        System.out.println("What is the title?");
         note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());

      //  System.out.println(note.getName() + note.getTopic() + note.getText());

    }

}
