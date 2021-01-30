/* package week11d01_Senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairFinder {

   public int findPairs(int[] arr){
       List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        int counter = 0;
        int onePaarCounter = 0;
        int totalPaarCounter = 0;
        for (int i = 0; i < arr.length; i++ ){
            for (int number : arr){
                if (number == arr[i]){
                    counter = counter + 1;
                }
            }
            onePaarCounter = (counter / 2) - (counter / 2) % 1;
            totalPaarCounter = totalPaarCounter + onePaarCounter;
            onePaarCounter = 0;
            counter = 0;

        }
        return totalPaarCounter;
    }

    public static void main(String[] args) {
        System.out.println(new PairFinder().findPairs(new int[]{5,1,4,5,4,4,2}));
    }

}

 */
