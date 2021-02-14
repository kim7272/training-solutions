package week13d02;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitiesTest {

    @Test
    void mostFlights() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Cities.class.getResourceAsStream("/cities.txt")))) {


            Cities cities = new Cities();
            List<Flight> flights = cities.listCreation(reader);

            String actual = cities.mostFlights();
            String expected = "Departure";
            assertEquals(expected, actual);

        }  catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }


    }

    @Test
    void selectFlight() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Cities.class.getResourceAsStream("/cities.txt")))) {

            Cities cities = new Cities();
            List<Flight> flights = cities.listCreation(reader);

            String actual = cities.selectFlight("FC5354").toString();
            String expected = "Flight{id='FC5354', direction='Arrival', city='Dublin', time=18:16}";
            assertEquals(expected, actual);

        }  catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    @Test
    void selectCityAndDirection() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Cities.class.getResourceAsStream("/cities.txt")))) {

            Cities cities = new Cities();
            List<Flight> flights = cities.listCreation(reader);

            String actual = cities.selectCityAndDirection("Zurich", "Departure").toString();
            String expected = "[Flight{id='NX7989', direction='Departure', city='Zurich', time=07:37}, Flight{id='FG3210', direction='Departure', city='Zurich', time=06:16}]";
            assertEquals(expected, actual);

        }  catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}