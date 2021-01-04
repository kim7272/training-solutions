package week10d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hiking {

    List<Double> elevations = new ArrayList<>();


    public double getPlusElevation(List<Double> elevations){
        double result = 0.0;
        for (int i = 0; i < elevations.size()-1; i++){
            if ((elevations.get(i) < elevations.get(i+1))){
                result = result + (elevations.get(i+1) - elevations.get(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Hiking().getPlusElevation(Arrays.asList(10.0,20.0,15.0,18.0)));
    }
}
