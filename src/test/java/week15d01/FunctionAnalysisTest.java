package week15d01;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FunctionAnalysisTest {

    @Test
    void maxEntry() {

        Map<Integer, Integer> function = Map.of(1,2,2,4,3,6,4,8,5,5,6,4,7,
                                                2,8,7,9,5,10,6);

        Map.Entry<Integer, Integer> actual = new FunctionAnalysis().maxEntry(function);

        assertEquals(4, actual.getKey());
        assertEquals(8, actual.getValue());

    }
}