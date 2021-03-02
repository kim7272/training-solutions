package interfacestaticmethods;

import java.util.List;

    interface Valued {

    double getValue();

    static double totalValue(List<Valued> items){
        double sum = 0;
        for (Valued item : items){
            sum = sum + item.getValue();
        }
        return sum;
    }
}
