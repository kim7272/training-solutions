package attributes.bill;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BillMain {

    public static void main(String[] args) {

      Bill bill = new Bill();

      Item item_1 = new Item("toll", 5,20);
      Item item_2 = new Item("labda", 7,25);
      Item item_3 = new Item("kefe", 6,30);
      Item item_4 = new Item("kendő", 8,35);
      Item item_5 = new Item("szappan", 9,15);

      bill.addItem(item_1);
      bill.addItem(item_2);
      bill.addItem(item_3);
      bill.addItem(item_4);
      bill.addItem(item_5);


      System.out.println(bill.calculateTotalPrice());
    }




}
