package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Subjects {

    private List<String> data = new ArrayList<>();

    public List<String> readLines(BufferedReader reader) throws IOException {
        String line;

        while ((line = reader.readLine())  != null) {
            data.add(line);
        }
        return data;
    }

    public int lessonsByTeacher(String teacher){

        int counter = 0;
        for (int i = 0; i < data.size(); i++){
            if (data.get(i).contains(teacher)){
                counter = counter + Integer.parseInt(data.get(i+3));
            }
        }
        return counter;
    }



    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("beosztas.txt"))) {
            Subjects subjects = new Subjects();
            subjects.readLines(reader);
            System.out.println(subjects.lessonsByTeacher("Albatrosz Aladin"));
           // new Subjects().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}