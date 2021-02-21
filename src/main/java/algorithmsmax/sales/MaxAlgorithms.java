package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

public class MaxAlgorithms {

    private List<Salesperson> salespeople = new ArrayList<>();

    public static class SalesAmountMaxSelector {

        public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople) {
            Salesperson salespersonMax = null;
            for (Salesperson salesperson : salespeople) {
                if (salespersonMax == null || salesperson.getAmount() > salespersonMax.getAmount()) {
                    salespersonMax = salesperson;
                }
                else if (salesperson.getAmount() == salespersonMax.getAmount() && salesperson.getTarget() < salespersonMax.getTarget()){
                    salespersonMax = salesperson;
                 }
            }
            return salespersonMax;
        }
    }

    public static class SalespersonWithFurthestAboveTargetSelector {

        public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespeople){
            Salesperson salespersonWithMaxTarget = null;

            for (Salesperson salesperson : salespeople){
                if (salespersonWithMaxTarget == null || (salesperson.getAmount() - salesperson.getTarget()) >
                    salespersonWithMaxTarget.getAmount() - salespersonWithMaxTarget.getTarget()){
                    salespersonWithMaxTarget = salesperson;
                }
            }
            return salespersonWithMaxTarget;
        }
    }

    public static class SalespersonWithFurthestBelowTargetSelector {

        public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespeople){
            Salesperson salespersonWithMinTarget = null;

            for (Salesperson salesperson : salespeople){
                if (salespersonWithMinTarget == null || (salesperson.getAmount() - salesperson.getTarget()) <
                        salespersonWithMinTarget.getAmount() - salespersonWithMinTarget.getTarget()){
                    salespersonWithMinTarget = salesperson;
                }
            }
            return salespersonWithMinTarget;
        }
    }


}


