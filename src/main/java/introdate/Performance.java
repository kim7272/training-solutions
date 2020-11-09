package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private  static LocalDate date = LocalDate.of(2020, 11, 8);
    private static LocalTime startTime = LocalTime.of(19, 00);
    private static LocalTime endTime = LocalTime.of(21, 30);
    private static String artist = "Queen";



    Performance(String artist, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.artist = artist;
    }

    public static LocalDate getDate() {
        return date;
    }

    public static LocalTime getStartTime() {
        return startTime;
    }

    public static LocalTime getEndTime() {
        return endTime;
    }

    public static String getArtist() {
        return artist;
    }

    public String getInfo(String artist, LocalDate date, LocalTime startTime, LocalTime endTime) {
        return (artist +": " + date + " " + startTime + "-" + endTime);
    }

}
