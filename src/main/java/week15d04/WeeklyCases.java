package week15d04;

public class WeeklyCases implements Comparable<WeeklyCases> {

    private String week;
    private int cases;

    public WeeklyCases(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(WeeklyCases o) {
        if(this.getCases() == o.getCases())
            return 0;
        else if(this.getCases() < o.getCases())
            return 1;
        else
            return -1;
    }
}


