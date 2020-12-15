package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    Random rand = new Random();
    List<Integer> selectedNumbers = new ArrayList<>();

    public List<Integer> getNumbers(int interval, int numbers){
        for (int i = 0; i < numbers; i++){
            selectedNumbers.add(1 + rand.nextInt(interval));
        }
        return selectedNumbers;
    }

    public static void main(String[] args) {
        System.out.println(new Lottery().getNumbers(90,5));
    }
}
