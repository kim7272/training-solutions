package week14d03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook{

    private List<Student> students = new ArrayList<>();

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook(){

        List<Student> result = new ArrayList<>(students);
        Collections.sort(result);

        return result;
    }

}
