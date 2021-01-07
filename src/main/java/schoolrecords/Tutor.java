package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subjectName) {
        int index = 0;
        for (Subject subject : taughtSubjects){
            if (subject.getSubjectName().equals(subjectName.getSubjectName())){
                index = 1;
            }
        }
        if (index == 1){
            return true;
        }
        return false;
    }
}

