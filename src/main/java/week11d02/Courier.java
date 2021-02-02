package week11d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public Courier(List<Ride> rides) {
        this.rides = rides;
    }

    public List<Ride> addRide(Ride ride) {

        if (ride.getDayOfWeek() < rides.get(rides.size() - 1).getDayOfWeek()) {
            throw new IllegalArgumentException("Invalid day parameter!");
        } else if (ride.getDayOfWeek() == rides.get(rides.size() - 1).getDayOfWeek() &&
                ride.getRideOfDay() < rides.get(rides.size() - 1).getRideOfDay()) {
            throw new IllegalArgumentException("Invalid order within day parameter!");
        } else {

            rides.add(ride);
        }
         return rides;
    }

    public List<Integer> daysWithJob(){
        List<Integer> days = new ArrayList<>();
        for (Ride ride : rides){
            days.add(ride.getDayOfWeek());
        }
        return days;
    }

    public int earliestNoJob() {
       List<Integer> noJobDays = new ArrayList<>();
       for (int i = 1; i < 6; i++){
           if (!daysWithJob().contains(i)){
               noJobDays.add(i);
           }
       }
       if (noJobDays.isEmpty()){
           return 0;
       }
       else {
           Collections.sort(noJobDays);
           return noJobDays.get(0);
       }


    }

    public static void main(String[] args) {
        List<Ride> rides = Arrays.asList(new Ride(1,1,12), new Ride(1,2,11),
                new Ride(2,1,10), new Ride(4,1,19));

        System.out.println();
    }
}
