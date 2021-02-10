 package week15d01;

import java.util.HashMap;
import java.util.Map;

public class FunctionAnalysis {

    public Map.Entry<Integer, Integer> maxEntry(Map<Integer, Integer> function){

        if (function.size() == 0) {
            throw new IllegalArgumentException("Invalid parameter!");
        }

        Map.Entry<Integer, Integer> result = null;
        double maxValue = Double.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : function.entrySet()){

            if (maxValue < entry.getValue()){
                result = entry;
                maxValue = entry.getValue();
            }
         }

        return result;
    }
}




