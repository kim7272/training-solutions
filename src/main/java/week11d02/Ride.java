package week11d02;

public class Ride {

    @Override
    public String toString() {
        return "(" + dayOfWeek + ", " + rideOfDay + ", " + distance + ")";
    }

    private int dayOfWeek;
    private int rideOfDay;
    private int distance;

    public Ride(int dayOfWeek, int rideOfDay, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.rideOfDay = rideOfDay;
        this.distance = distance;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getRideOfDay() {
        return rideOfDay;
    }

    public int getDistance() {
        return distance;
    }
}
