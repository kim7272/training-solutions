 package exceptionclass.course;

public class InvalidTimeException extends RuntimeException{

    private int hour;
    private int minute;

    private String timeStr;

    public InvalidTimeException(String message, int hour, int minute, String timeStr) {
        super(message);
        this.hour = hour;
        this.minute = minute;
        this.timeStr = timeStr;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTimeStr() {
        return timeStr;
    }
}


