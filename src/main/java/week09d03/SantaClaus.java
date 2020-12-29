package week09d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SantaClaus {

    List<Person> persons = new ArrayList<>();

    public SantaClaus(List<Person> persons){
        this.persons = persons;
    }

    public List<Present> getThroughChimney() {
        List<Present> presents = new ArrayList<>();
        for (Person person : persons) {
            presents.add(person.setPresent());
        }
        return presents;
    }


    public static void main(String[] args) {
        System.out.println(new SantaClaus(Arrays.asList(new Person("Feri", 48), new Person("Laci",12))).getThroughChimney());
    }

}