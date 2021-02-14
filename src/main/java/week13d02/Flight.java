package week13d02;

import java.time.LocalTime;

public class Flight {

    private String id;
    private String direction;
    private String city;
    private LocalTime time;

    public Flight(String id, String direction, String city, LocalTime time) {
        this.id = id;
        this.direction = direction;
        this.city = city;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", direction='" + direction + '\'' +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
