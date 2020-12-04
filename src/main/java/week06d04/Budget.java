package week06d04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Budget {

    private List<Item> items;
    public Budget(List<Item> items) {
        this.items = items;
    }
    public List <Item> getItemsByMonth(int month) {
        List<Item> itemsSelected = new ArrayList<>();
        for (Item item : items) {
            if (item.getMonth()== month) {
                itemsSelected.add(item);
            }
        }
        return itemsSelected;
    }

    public List<Item> getItems() {
        return items;
    }

    public static void main(String[] args) {
        System.out.println(new Budget(Arrays.asList(
                new Item(120, 10, "potetoe"),
                new Item(100, 9, "apple"),
                new Item(110, 10, "bean"),
                new Item(130, 11, "milk"),
                new Item(140, 10, "icecream"))).getItemsByMonth(9).size());
    }
}
