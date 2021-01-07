package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rdn;
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(student.getName())) {
                index = 1;
            }
        }
        if (index == 0) {
            students.add(student);
            return true;
        }
        return false;
    }
    public boolean removeStudent(Student student){
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(student.getName())) {
                index = 1;
            }
        }
        if (index == 1) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        int count = 0;
        double gradeSum = 0.0;
        double result = 0.0;
        List<Integer> indexStudentWithMark = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (!(students.get(i).getMarks().isEmpty())) {
                count = count + 1;
                indexStudentWithMark.add(i);
            }
        }
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        } else if (count == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else {
            for (int index : indexStudentWithMark) {
                int numberOfGrades = students.get(index).getMarks().size();
                int totalNumberOfGrades = 0;
                for (int j = 0; j < numberOfGrades; j++) {
                    gradeSum = gradeSum + students.get(index).getMarks().get(j).getMarkType().getValue();
                    totalNumberOfGrades = totalNumberOfGrades + numberOfGrades;
                }
                result = gradeSum / totalNumberOfGrades;
                result = Math.round(result*100.0) / 100.0;
            }
            return result;
        }
    }
    public String getClassName(){
        return className;
    }
    public List<Student> getStudents(){
        return students;
    }
    public ClassRecords(String className, Random rdn){
        this.className = className;
        this.rdn = rdn;
    }
    public double calculateClassAverageBySubject(Subject subject){
        int count = 0;
        double gradeSum = 0.0;
        double totalGradeSum = 0.0;
        double result = 0.0;

        List<Double> averagesOfStudentsInSubject = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).getMarks().size(); j++) {
                if (students.get(i).getMarks().get(j).getSubject().getSubjectName().equals(subject.getSubjectName())) {
                    count = count + 1;
                    gradeSum = gradeSum + students.get(i).getMarks().get(j).getMarkType().getValue();
                }
            }
                double average = gradeSum / count;
                average = Math.round(average * 100.0) / 100.0;
                if (average > 0) {
                    averagesOfStudentsInSubject.add(average);
                }
                count = 0;
                gradeSum = 0.0;
            }
            for (int k = 0; k < averagesOfStudentsInSubject.size(); k++) {
                totalGradeSum = totalGradeSum + averagesOfStudentsInSubject.get(k);
            }
            result = totalGradeSum / averagesOfStudentsInSubject.size();
            return Math.round(result * 100) / 100.0;
    }
    public Student findStudentByName(String name){
        int index = 0;
        Student result = null;
        if (name.isBlank()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        else if (students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students) {
            if (student.getName().equals(name)){
                result = student;
                index = 1;
            }
        }
        if ( index == 0){
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return result;
    }
    public Student repetition(){
        if (students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rdn.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResults = new ArrayList<>();
        for (Student student : students){
            studyResults.add(new StudyResultByName( student.calculateAverage(),student.getName()));
        }
        return studyResults;
    }

   public String listStudentNames(){
        String result = "";
        for (int i = 0; i < students.size()-1; i++){
        result = result + students.get(i).getName() + ", ";
        }
        result = result + students.get(students.size()-1).getName();
        return result;
    }

    public static void main(String[] args) {

        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));

        ClassRecords classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);



        System.out.println(classRecords.students.size());



    }
}
