package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return  new ArrayList<>(countryList);
    }

    public void readFromFile(String fileName){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.
                class.getResourceAsStream("/" + fileName)))){

            String line;

            while ((line = reader.readLine()) != null){
                String[] countryInfo = line.split(" ");
                countryList.add(new Country(countryInfo[0],Integer.parseInt(countryInfo[1])));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOfCountries(){
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country countryWithMostNeighbours = countryList.get(0);
        for (Country country : countryList) {
            if (country.getBorderCountries() > countryWithMostNeighbours.getBorderCountries()) {
                countryWithMostNeighbours = country;
            }
        }
        return countryWithMostNeighbours;
    }
}
