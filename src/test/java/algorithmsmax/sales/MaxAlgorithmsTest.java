import algorithmsmax.sales.MaxAlgorithms;
import algorithmsmax.sales.Salesperson;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MaxAlgorithmsTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("John", 600, 500),
            new Salesperson("Bill", 200, 300),
            new Salesperson("Kate", 700, 100),
            new Salesperson("Mary", 700, 300),
            new Salesperson("Karl", 200, 50)
    );

    @Test
    public void testSelectSalesPersonWithMaxSalesAmount() {
        MaxAlgorithms.SalesAmountMaxSelector maxAmount = new MaxAlgorithms.SalesAmountMaxSelector();

        assertEquals(700, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
        assertEquals(100, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestAboveTarget() {
        MaxAlgorithms.SalespersonWithFurthestAboveTargetSelector aboveTarget = new MaxAlgorithms.SalespersonWithFurthestAboveTargetSelector();

        assertEquals(600, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getDifferenceFromTarget());
        assertEquals(700, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(100, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestBelowTarget() {
        MaxAlgorithms.SalespersonWithFurthestBelowTargetSelector belowTarget = new MaxAlgorithms.SalespersonWithFurthestBelowTargetSelector();

        assertEquals(-100, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getDifferenceFromTarget());
        assertEquals(200, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(300, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
    }

}
