package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public String textFromList(List<String> list){
    if (list == null)

    {
        throw new IllegalArgumentException("Invalid parameter!");
    }

        StringBuilder textBuilder = new StringBuilder();
        textBuilder.append("[");


        if (list.isEmpty()) {
            textBuilder.append("");
        }
        else {
            if (list.size() % 2 == 0) {
                for (int i=0; i < list.size() - 3; i++) {
                    if (i % 2 == 0) {
                        textBuilder.append(list.get(i) + ", ");
                    }
                }
                textBuilder.append(list.get(list.size() - 2));
        }   else {
                for (int i=0; i < list.size() - 2; i++) {
                    if (i % 2 == 0) {
                        textBuilder.append(list.get(i) + ", ");
                    }
                }
                textBuilder.append(list.get(list.size() - 1));
                }

        }
        textBuilder.append("]");

        String finalText = textBuilder.toString();
        return finalText;
    }

    public static void main(String[] args) {
        System.out.println(new ListSelector().textFromList(Arrays.asList("Bombay", "Chennay", "Delhi", "Bangalore","Kahmir")));
    }
  }


