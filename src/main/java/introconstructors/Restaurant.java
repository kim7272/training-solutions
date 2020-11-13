package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<String> menu = new ArrayList<>();
    String name;
    int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = 4 * numberOfTables;
        this.menu = getMenu();
    }

    public void setMenu(String before, String main_1, String main_2, String after) {
        this.menu.add(before);
        this.menu.add(main_1);
        this.menu.add(main_2);
        this.menu.add(after);
    }

    public List<String> getMenu() {
        return menu;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}
