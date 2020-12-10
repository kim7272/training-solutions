package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;


    public Lab(String title){
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt){
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public String complete (LocalDate date){
        this.completed = true;
        this.completedAt = date;
        String boolAndDate;
        boolAndDate =  this.completed + " " +  this.completedAt.toString();
        return boolAndDate;

    }

    public void complete(){
        this.completedAt = LocalDate.now();
        this.completed = true;
        String boolAndDate;
        boolAndDate = this.completed + " " + this.completedAt.toString();
    }

    public String toString(){
        return title + " " + completed;

    }

    public String toString(String title){
        return title;
    }

    public LocalDate getCompletedAt(){
        return completedAt;
    }

  }


