package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }
    public void store(int stock) {
        this.stock = this.stock + stock;
    }
    public void dispatch(int stock) {
        this.stock = this.stock - stock;
    }

    public int getStock() {
        return stock;
    }
    public String getProduct() {
        return product;
    }
}
