package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product product) {

        int difference = Math.abs(this.code.length() - product.code.length());

        if (this.name.equals(product.getName()) && (difference <= 1)) {
            return true;
        }
            return false;
    }
}
