 package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        if (name == null){
           throw new IllegalArgumentException();
        }
        if (begin == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    public String toString(){
        if (getBegin().getHour() < 10) {
            return "0"+ getBegin().getHour() + ":"+ getBegin().getMinute() + ": " + getName();
        }
        else if (getBegin().getHour() < 10 && getBegin().getMinute() < 10){
            return "0"+ getBegin().getHour() + ":0"+ getBegin().getMinute() + ": " + getName();
        }
        else if (getBegin().getMinute() < 10){
            return getBegin().getHour() + ":0" + getBegin().getMinute() + ": " + getName();
        }
        else {
            return getBegin() + ": " + getName();
        }

    }
}


