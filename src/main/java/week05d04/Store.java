package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}

