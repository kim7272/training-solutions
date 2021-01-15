package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    private String timeStr;


    public SimpleTime(String timeStr) {

        if (timeStr == null) {
            throw new InvalidTimeException("Time is null", hour, minute, timeStr);
        }
        try {
            String[] timeValues = timeStr.split(":");
            int hour = Integer.parseInt(timeValues[0]);
            int minute = Integer.parseInt(timeValues[1]);
            this.hour = Integer.parseInt(timeValues[0]);
            this.minute = Integer.parseInt(timeValues[1]);
        } catch (NumberFormatException e) {
            throw new InvalidTimeException("Time is not hh:mm", hour, minute, timeStr);
        }
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)", hour, minute, timeStr);
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)", hour, minute, timeStr);
        }
    }
    public SimpleTime(int hour, int minute) {
        if (hour<0 || hour>23){
            throw new InvalidTimeException("Hour is invalid (0-23)",hour, minute, timeStr);
        }
        if (minute<0 || minute>59){
            throw new InvalidTimeException( "Minute is invalid (0-59)",hour, minute, timeStr);
        }
        this.hour = hour;
        this.minute = minute;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String toString(){
        if (hour < 10) {
            return "0"+ getHour() + ":"+ getMinute();
        }
        else if (hour < 10 && minute < 10){
            return "0"+ getHour() + ":0"+ getMinute();
        }
        else {
            return getHour() + ":" + getMinute();
        }
    }

}
