package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name){
        if (price <= 0) {
            throw new IllegalArgumentException("Wrong price!");
        }
        else if (month >12 || month < 1) {
            throw new IllegalArgumentException("Month should be between 1 and 12!");
        }
        else if (name == ""){
            throw new IllegalArgumentException("Name field must contain something!");
        }
        this.price = price;
        this.month = month;
        this.name = name;
    }
    public int getMonth(){
        return month;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;

    }

    public static void main(String[] args) {
        System.out.println(new Item(120,12,"").getMonth());
    }
}



