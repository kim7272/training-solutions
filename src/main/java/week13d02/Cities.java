package week13d02;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cities {

    private List<Flight> flights = new ArrayList<>();

    public List<Flight> listCreation (BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            String[] timeParts = parts[3].split(":");
            Integer hours = Integer.parseInt(timeParts[0]);
            Integer minutes = Integer.parseInt(timeParts[1]);
            LocalTime time = LocalTime.of(hours, minutes);
            flights.add(new Flight(parts[0],parts[1],parts[2], time));
        }
        return flights;
    }
    public String mostFlights(){

        int depCounter = 0;
        int arrCounter = 0;

        for (Flight flight : flights){
            if (flight.getDirection().equals("Arrival")){
                arrCounter += 1;
            }
            else {
                depCounter += 1;
            }
        }
        if (arrCounter > depCounter){
            return "Arrival";
        }
        else {
            return "Departure";
        }
    }
    public Flight selectFlight(String ident){

        Flight result = null;
        for (Flight flight : flights){
            if (flight.getId().equals(ident)){
            result = flight;
            }
        }
        return result;
    }
    public List<Flight> selectCityAndDirection(String city, String direction){

        List<Flight> selFlights = new ArrayList<>();

        for (Flight flight : flights){
            if (flight.getCity().equals(city) && flight.getDirection().equals(direction)){
                selFlights.add(flight);
            }
        }
        return selFlights;
    }


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Cities.class.getResourceAsStream("/cities.txt")))) {

           Cities cities = new Cities();
           List<Flight> flights = cities.listCreation(reader);

           System.out.println(cities.mostFlights());
           System.out.println(cities.selectFlight("FC5354"));
           System.out.println(cities.selectCityAndDirection("Zurich", "Departure"));

        }  catch (IOException ioe) {
           throw new IllegalStateException("Can not read file", ioe);
         }
    }
}

