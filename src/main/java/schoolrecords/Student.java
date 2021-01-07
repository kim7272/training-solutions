package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public double calculateAverage(){
        if (marks.size() == 0){
            return 0.0;
        }
        double average = 0.00;
        double sum = 0.00;
        for (int i = 0; i < marks.size(); i++){
            sum = sum + marks.get(i).getMarkType().getValue();
        }
        average = sum / (marks.size());
        average = Math.round(average*100.0)/100.0;
        return average;
    }
    public double calculateSubjectAverage(Subject subject){

        if (marks.size() == 0){
            return 0.0;
        }
        double subjectAverage = 0.00;
        double sum = 0.00;
        int index = 0;
        for (int j = 0; j < marks.size(); j++){
            if (marks.get(j).getSubject().getSubjectName().equals(subject.getSubjectName())){
                sum = sum + marks.get(j).getMarkType().getValue();
                index = index + 1;
            }
        }
        if (index == 0){
            return 0.0;
        }
        subjectAverage = sum / index;
        subjectAverage = Math.round(subjectAverage*100.0)/100.0;
        return subjectAverage;
    }
   // public boolean equals(Object object) {
     //   return;
    //}
    public String getName(){
        return name;
    }
    public List<Mark> getMarks(){
        return marks;
    }
    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }
    //private boolean isEmpty(String name){
    //    if (new Student(student).)
    //    return;
    //}
    public Student(String name){
       if (name.isBlank()){
           throw new IllegalArgumentException("Student name must not be empty!");
      }
        this.name = name;
    }

    public String toString(){
        return getName() + " marks: " + marks.get(marks.size()-1).getSubject().getSubjectName() + ": " + marks.get(marks.size()-1);
    }
}

