  package week10d02;

import java.util.List;

public class MaxTravel {

    int maxIndex = 0;


    public int getMaxIndex(List<Integer> passengers) {

        int[] busStops = new int[30];


        for (Integer passenger : passengers){
            if (passenger > 30){
                throw new IllegalArgumentException("Invalid parameter!");
            }
            else {
               busStops[passenger]++;
            }
        }
        for (int i = 0; i < busStops.length; i++) {
            if (busStops[i] > busStops[maxIndex]){
                maxIndex = i;
            }
        }
            return maxIndex;
    }
}



