package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class CdvCheck {

    private List<Integer> numbers = new ArrayList<>();
    private int number;
    private int sum;
    private int rest;
    private boolean result;


    public boolean check(String tax) {

        if (tax.length() != 10) {
            throw new IllegalArgumentException("Wrong parameter!");
        }
        for (int i = 0; i < tax.length(); i++) {
            number = Integer.parseInt(tax.substring(i, i + 1));
            numbers.add(number);
        }
        for (int i = 1; i < numbers.size() - 1; i++) {
            sum = sum + number * i;
        }
        rest = sum % 11;
        {
            if (rest == numbers.get(9)) {
                result = true;
            } else {
                result = false;
            }

        }
        return result;
    }
}
