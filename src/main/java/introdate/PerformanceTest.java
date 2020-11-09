package introdate;

import static introdate.Performance.getArtist;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance(Performance.getArtist(), Performance.getDate(), Performance.getStartTime(),Performance.getEndTime());


        System.out.println(performance.getInfo(performance.getArtist(), performance.getDate(), performance.getStartTime(), performance.getEndTime()));
    }

}
