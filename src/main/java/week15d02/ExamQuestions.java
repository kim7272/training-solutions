package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExamQuestions {

    private List<Scores> scores = new ArrayList<>();


    Path file = Path.of("Kerdesek.txt");

    public List<String> allTestData(Path file){

        List<String> testData = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null){
                testData.add(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file!");
        }
        return testData;
    }

    public List<String> questionsBySubject(String subject){

        List<String> result = new ArrayList<>();
        List<String> testData = new ArrayList<>(allTestData(file));
        for (int i = 0; i < testData.size(); i++){
            if (testData.get(i).contains(subject)){
                result.add(testData.get(i-1));
            }
        }
        return result;
    }

    Random random = new Random(15);

    public String randomQuestion(){

        List<String> testData = new ArrayList<>(allTestData(file));
        String result = "";

        int number = random.nextInt(testData.size());
        if (number % 2 == 0){
            number = number -1;
        }
        result =  testData.get(number-1) + "  " + testData.get(number);
        return result;

    }

    public Set<String> SubjectList(){

        Set<String> subjects = new HashSet<>();
        List<String> data = new ArrayList<>(allTestData(file));
        for (int i = 1; i < data.size(); i = i + 2){
            String[] items = data.get(i).split(" ");
            subjects.add(items[2]);
        }
        return subjects;
    }

    public Map<String, List<String>> QuestionsByAllSubjects(){

        Map<String, List<String>> result = new HashMap<>();
        for (String subject : SubjectList()){
            result.put(subject, questionsBySubject(subject));
        }
        return result;
  }

    public Map<String, Integer> scoreBySubject() {

        Map<String, Integer> result = new HashMap<>();
        int points = 0;

        for (String subject : SubjectList()) {
            for (String dataLine : allTestData(file)) {
                if (dataLine.contains(subject)) {
                    points = Integer.parseInt(dataLine.split(" ")[1]);
                    if (result.containsKey(subject)) {
                        result.put(subject, result.get(subject) + points);
                    } else {
                        result.put(subject, points);
                    }
                }
            }
        }
        return result;
    }

    public String subjectWithMaxScore(){

       for (Map.Entry<String, Integer> entry : scoreBySubject().entrySet()){

           scores.add(new Scores(entry.getKey(), entry.getValue()));
       }
       Collections.sort(scores);

       return scores.get(0).getSubject();
    }






    public static void main(String[] args) {

        Path file = Path.of("Kerdesek.txt");

        System.out.println(new ExamQuestions().QuestionsByAllSubjects());
    }
}


