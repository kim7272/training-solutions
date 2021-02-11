package week14d02;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    void getProductsByIndexInOrder() {

        List<String> actual = new ShoppingList().getProductsByIndexInOrder("A233");
        List<String> expected = new ArrayList<>();
        expected.add("bread");
        expected.add("flour");
        expected.add("sugar");
        expected.add("tomato");

        assertEquals(expected, actual);
    }

    @Test
    void numberOfProductsByIndex() {

        int actual = new ShoppingList().numberOfProductsByIndex("A233");
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void numberOfProductByName() {

        int actual = new ShoppingList().numberOfProductByName("tomato");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void numberOfAllProducts() {

        String actual = new ShoppingList().numberOfAllProducts().toString();

        assertEquals("{pepper=1, chips=1, corn=1, rosmary=2, hot_dog=1, tomato=2, cheese=2, cola=1, apple=1, pear=1, potato=1, flour=1, pasta=2, passata=2, pizza_dough=1, beer=2, bbq_sauce=1, bread=1, salt=1, basil=1, oregano=1, rolls=1, soda=2, meet=2, sugar=3, wine=1, carrot=1}", actual);
    }
}