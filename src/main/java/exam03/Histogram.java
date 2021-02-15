package exam03;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Histogram {

 public String createHistogram(BufferedReader reader) throws IOException {
     String line;
     String result = "";
     //StringBuilder sb = new StringBuilder();
     String part = "";
     while ((line = reader.readLine())  != null) {
         int index = Integer.parseInt(line);
         for (int i = 0; i < index; i++){
             part = part + "*";
         }
         result = result + part + "\n";
       }
        result = result + "\n";

        return result;
     }


    public static void main(String[] args) {
     try (BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("histogram.txt")))) {
          new Histogram().createHistogram(reader);

    } catch (IOException ioe) {
        throw new IllegalStateException("Can not read file", ioe);
    }
  }
}

