package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTest {


    @Test

    public void labTestWithCompleteConstructor(){

     Lab lab = new Lab("Electronics", LocalDate.of(2020, 02,25));
     String actual = lab.toString() + " " +  lab.getCompletedAt().toString();

     assertEquals("Electronics true 2020-02-25",actual);
    }

    @Test

    public void labTestWithHalfConstructorAndGivenDate(){

    String actual = new Lab("Electronics").toString("Electronics") + " " + new Lab("Electronics").complete(LocalDate.of(2020,12,15)).toString();

    assertEquals("Electronics true 2020-12-15",actual);
    }

    @Test

    public void labTestWithHalfConstructorAndCurrentDate(){

    String actual = new Lab("Electronics").toString("Electronics") + " " + new Lab("Electronics").complete(LocalDate.of(2020,9,18)).toString();

    assertEquals("Electronics true 2020-09-18", actual);

    }
}
