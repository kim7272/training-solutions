package week11d02;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {



   @Test
    void addRide() {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1,1,12));
        rides.add(new Ride(1,2,11));
        rides.add(new Ride(2,1,10));
        rides.add(new Ride(4,1,19));

        Courier courier = new Courier(rides);

        String actual = courier.addRide(new Ride(4,2,12)).toString();
        String expected = "[(1, 1, 12), (1, 2, 11), (2, 1, 10), (4, 1, 19), (4, 2, 12)]";

        assertEquals(expected,actual);

    }

    @Test

    public void invalidDayParamShouldThrowException() throws Exception {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1,1,12));
        rides.add(new Ride(1,2,11));
        rides.add(new Ride(2,1,10));
        rides.add(new Ride(4,1,19));

        Courier courier = new Courier(rides);
        Exception ex =   assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(2,2,10)));
        assertEquals("Invalid day parameter!", ex.getMessage());
    }

    @Test

    public void invalidOrderWithinDayParamShouldThrowException() throws Exception {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1,1,12));
        rides.add(new Ride(1,2,11));
        rides.add(new Ride(2,1,10));
        rides.add(new Ride(4,2,19));

        Courier courier = new Courier(rides);
        Exception ex =   assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(4,1,10)));
        assertEquals("Invalid order within day parameter!", ex.getMessage());
    }



    @Test
    void earliestNoJob() {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1,1,12));
        rides.add(new Ride(1,2,11));
        rides.add(new Ride(2,1,10));
        rides.add(new Ride(4,1,19));

        Courier courier = new Courier(rides);

        int actual = courier.earliestNoJob();
        int expected = 3;

        assertEquals(expected, actual);
    }
}

