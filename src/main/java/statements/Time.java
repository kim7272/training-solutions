package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        return this.minutes + this.hours *60;
    }

    public int getInSeconds() {
        return this.seconds + this.getInMinutes() * 60;
    }

    public boolean earlierThan(Time time) {
        if (this.getInSeconds() < time.getInSeconds())
            return true;
        else return false;
    }

    public String toString(){
        return this.hours+":"+this.minutes+":"+this.seconds;
    }
}


