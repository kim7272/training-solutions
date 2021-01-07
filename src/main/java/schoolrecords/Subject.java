package schoolrecords;

public class Subject {

    private String subjectName;

 //   public boolean equals(Object object){

  //  }
    public String getSubjectName(){
        return subjectName;
    }
    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public static void main(String[] args) {

        System.out.println(new Subject("matematika").getSubjectName());
    }
}
