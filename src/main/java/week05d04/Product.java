package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expireDate;

    public Product(String name, int year, int month, int day){

        this.name = name;
        expireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

  /*  public static void main(String[] args) {
        System.out.println(new Product("apple", 2020,12,21).getExpireDate() );
    }

   */
}
