package iowritestring.school;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Register {


    public void newMark(Path file, int mark) {

        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }

    public void average(Path file) {
        double sum = 0;
        int counter = 0;
        double averageValue;
        try {
            List<String> marks = Files.readAllLines(file);
            for (String mark : marks) {
                sum = sum + Double.parseDouble(mark);
                counter = counter + 1;
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
        averageValue = sum / counter;
        try {
            Files.writeString(file, "average: " + averageValue, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }
}
