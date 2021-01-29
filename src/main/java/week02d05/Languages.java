package week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> programs = Arrays.asList("Java", "Phython", "JavaScript");

        for (String program : programs){
            if (program.length() > 5){
                System.out.println(program);
            }
        }
    }
}
