package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {

        if (arr.length < 4){
            throw new IllegalArgumentException("Array should contain at least 4 elements!");
        }
        Arrays.sort(arr);
        int minSum = 0;
        int counter = 0;
        for (int i = 0; i < 4; i++){
            minSum = minSum + arr[i];
        }
        return minSum;
    }
}
