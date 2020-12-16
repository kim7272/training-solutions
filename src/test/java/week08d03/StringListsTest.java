package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void testUnionOfTwoLists(){
        StringLists stringLists = new StringLists();
        List<String> first = new ArrayList<>();
        first.add("ene"); first.add("mene"); first.add("muu");
        List<String> second = Arrays.asList("ec", "pec", "kimehetsz");
        List<String> union = stringLists.stringListsUnion(first, second);

        List<String> actual = union;
        List<String> expected = Arrays.asList("ene", "mene", "muu", "ec", "pec", "kimehetsz");

        assertEquals(actual, expected);
    }
}


