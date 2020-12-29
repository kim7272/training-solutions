package week09d03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SantaClausTest {

    @Test
    public void getThroughChimneyTest(){
        SantaClaus santaClaus = new SantaClaus(Arrays.asList(new Person("Feri", 48), new Person("Laci",12)));
        List<Present> actual = santaClaus.getThroughChimney();
        List<Present> expected = Arrays.asList(new Person("Feri", 48).setPresent(), new Person("Laci",12).setPresent());

        assertEquals(expected,actual);

    }

}

