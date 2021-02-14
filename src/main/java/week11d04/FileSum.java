 package week11d04;

 import java.io.File;
 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Path;

 public class FileSum {

     public int fileContent(String file){

         Path path = Path.of(file);

         try {
           String content = Files.readString(path);
           int number = Integer.parseInt(content);
           return number;
         } catch (IOException e) {
             throw new IllegalStateException("Can not read file!");
         }
     }

     public int sumNumbers() {

         int sum = 0;
         String filename = "";
         for (int i = 0; i < 100; i++) {
             filename = i < 10 ? "number0" + i + ".txt" : "number" + i + ".txt";

             //System.out.println(filename);
             if (Files.isRegularFile(Path.of(filename))) {
                // System.out.println("found");
                 int content = fileContent(filename);
                 sum = sum + content;
             }
         }
         return sum;
     }

     public static void main(String[] args) {

         FileSum fileSum = new FileSum();
         System.out.println(fileSum.fileContent("number01.txt"));
         System.out.println(fileSum.sumNumbers());

     }
 }


