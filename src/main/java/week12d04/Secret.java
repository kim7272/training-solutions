package week12d04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Secret {

    List<Character> characters = new ArrayList<>();
    String str;

    public String readFile(){

        Path file = Path.of("secret.dat");

        try {
            byte[] bytes = Files.readAllBytes(file);
            for (byte item : bytes) {
                char ch = (char) (item + 10);
                characters.add(ch);
            }
           StringBuilder sb = new StringBuilder();
            for (Character ch : characters){
                sb.append(ch);
            }
             str = sb.toString();
            System.out.println(str);
        }
        catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
        return str;
    }

    public static void main(String[] args) {
       System.out.println(new Secret().readFile());
    }
}



