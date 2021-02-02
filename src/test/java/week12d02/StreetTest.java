package week12d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    @Test
    void lastSold() {

        List<Site> sites = Arrays.asList(new Site(0,10,Fence.PERFECT),new Site(0,7,Fence.NEED_UPGRADE),new Site(1,12,Fence.NEED_UPGRADE),
        new Site(0,9,Fence.PERFECT),new Site(0,11,Fence.NO_FENCE),new Site(1,13,Fence.PERFECT));

        int actual = new Street(sites).lastSold();
        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    void getNumberByFenceType() {

        List<Site> sites = Arrays.asList(new Site(0,10,Fence.PERFECT),new Site(0,7,Fence.NEED_UPGRADE),new Site(1,12,Fence.NEED_UPGRADE),
        new Site(0,9,Fence.PERFECT),new Site(0,11,Fence.NO_FENCE),new Site(1,13,Fence.PERFECT));

        String actual = new Street(sites).getNumberByFenceType().toString();
        String expected = "[(Fence type: PERFECT, Number of sites: 3), (Fence type: NEED_UPGRADE, Number of sites: 2), (Fence type: NO_FENCE, Number of sites: 1)]";

        assertEquals(expected, actual);

    }
}