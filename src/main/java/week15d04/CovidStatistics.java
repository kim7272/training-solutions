package week15d04;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidStatistics {

    private List<WeeklyCases> weeklyCases;

    Path file = Path.of("data.csv");

    public List<WeeklyCases> HungarianWeeklyData(Path file){

        List<WeeklyCases> hungarianCases = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null){
                if (line.contains("Hungary")){
                   String[] array = line.split(",");
                   int cases = Integer.parseInt(array[3]);
                   hungarianCases.add(new WeeklyCases(array[1], cases));
                }
            }
        } catch (IOException e) {
           throw new IllegalArgumentException("Can not read file!");
        }
        return hungarianCases;
    }

    public List<String> ThreeMaxHungarianWeek(){

        List<WeeklyCases> hungarianCases = new ArrayList<>(HungarianWeeklyData(file));
        List<String> result = new ArrayList<>();
        Collections.sort(hungarianCases);

        for (int i = 0; i < 3; i++){
            result.add(hungarianCases.get(i).getWeek());
        }
        return result;
    }




  public static void main(String[] args) {

      Path file = Path.of("data.csv");

      System.out.println(new CovidStatistics().ThreeMaxHungarianWeek());
  }
}
