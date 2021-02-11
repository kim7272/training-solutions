package week15d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CovidStatisticsTest {

    @Test
    void threeMaxHungarianWeek() {

        String actual = new CovidStatistics().ThreeMaxHungarianWeek().toString();

        assertEquals("[2020-49, 2020-51, 2020-50]", actual);
    }
}