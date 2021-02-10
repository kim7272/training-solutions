package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements  Comparable<Student> {

    private String name;

    private Map<String, List<Integer>> notes = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student st){

        return this.getName().compareTo(st.getName());
   }


    public void addNote(String subject, int note){

        if (!notes.containsKey(subject)){
            notes.put(subject, new ArrayList<>());
        }
        else {
            notes.get(subject).add(note);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}


