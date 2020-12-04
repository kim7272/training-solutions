package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(120, 10, "potatoe"),
            new Item(100, 9, "apple"),
            new Item(110, 10, "bean"),
            new Item(130, 11, "milk"),
            new Item(140, 10, "icecream")));

    @Test

    public void BudgetTest(){
    List<Item> result = budget.getItemsByMonth(10);

    assertEquals(3, result.size());


    }
}
