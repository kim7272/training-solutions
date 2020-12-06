package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category) {
        int counter = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}