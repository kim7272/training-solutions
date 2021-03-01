package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours){
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime(SimpleTime time){
        this.hours = time.hours;
        this.minutes = time.minutes;
    }

    public int difference(SimpleTime time){
        int paramMinute = time.hours * 60 + time.minutes;
        int thisMinute = this.hours * 60 + this.minutes;
        return thisMinute - paramMinute;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
