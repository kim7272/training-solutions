package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> data = new HashMap<>();

    public Map<String, Integer> readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null){
            String[] convert = line.split("=");
            data.put(convert[0],Integer.parseInt(convert[1]));
        }
        return data;
    }

    public int getNumberOfOwls(String county){
        return data.get(county);
    }
}
