package inheritanceattributes.order;


import inheritanceattributes.book.Book;

public class ShippedBook extends Book {

    int shippingCost;

    public ShippedBook(String title, int price, int shippingCost){
        super(title, price);
        this.shippingCost = shippingCost;
    }
    public int order(int pieces){
        return 2*super.getPrice() + this.shippingCost;
    }
    public String toString(){
      return super.getTitle() + ":" + super.getPrice() + " - " + this.shippingCost;
    }
}


