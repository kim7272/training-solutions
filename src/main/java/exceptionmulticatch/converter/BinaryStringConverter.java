package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String text) {
        boolean[] b;
        if (text == null){
            throw new NullPointerException("binaryString null");
        }
        List<Integer> numbers = new ArrayList<>();
        String[] array = text.split("");
        for (int i = 0; i < array.length; i++) {
            numbers.add(Integer.parseInt(array[i]));
        }
        for (int number : numbers) {
            if ((number != 0) && (number != 1)) {
                throw new IllegalArgumentException("binaryString not valid");
            }
        }
        b = new boolean[numbers.size()];
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == 0) {
                b[j] = false;
            } else {
                b[j] = true;
            }
        }
        return b;
    }

    public String booleanArrayToBinaryString(boolean[] values) {
        List<Integer> numbers = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        String string;
        if (values.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }
        for (boolean b : values) {
            if (b == true) {
                numbers.add(1);
            } else {
                numbers.add(0);
            }
        }
        for (Integer number : numbers) {
            str.append(number.toString());
        }
        string = str.toString();
        return string;
    }

    /* public static void main(String[] args) {
        String binaryString = "011100";
        String[] array = binaryString.split("");
        List<Integer> numbers = new ArrayList<>();
        int number = Integer.parseInt(array[1]);
        numbers.add(Integer.parseInt(array[1]));

            System.out.println(numbers.get(0));

        }

     */
    }