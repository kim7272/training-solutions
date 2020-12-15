package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    Random rand = new Random();
    List<Integer> selectedNumbers = new ArrayList<>();
    int newNumber;

    public List<Integer> getNumbers(int interval, int numbers){
        while (selectedNumbers.size() < numbers){
            newNumber = (1 + rand.nextInt(interval));
            if (!(selectedNumbers.contains(newNumber))) {
            selectedNumbers.add(newNumber);
            }
        }
        return selectedNumbers;
    }

    public static void main(String[] args) {
        System.out.println(new Lottery().getNumbers(90,5));
    }
}
