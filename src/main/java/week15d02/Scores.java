package week15d02;

public class Scores implements Comparable<Scores>{

    private String subject;
    private int score;

    public Scores(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Scores o) {
        return o.getScore() - this.getScore();
    }
}


