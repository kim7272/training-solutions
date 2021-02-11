package week14d02;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ShoppingList {

    public Map<String, List<String>> creationOfShoppingList() {

        Path file = Path.of("shopping.txt");
        Map<String, List<String>> shoppingList = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] firstSplit = line.split(" ", 2);
                String index = firstSplit[0];
                List<String> products = Arrays.asList(firstSplit[1].split(","));
                shoppingList.put(index, products);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file!", ioe);
        }
        return shoppingList;
    }

    public List<String> getProductsByIndexInOrder(String index) {

        Map<String, List<String>> shoppingList = new HashMap<>(creationOfShoppingList());
        List<String> products = new ArrayList<>();
        products = shoppingList.get(index);
        Collections.sort(products);

        return products;
    }

    public int numberOfProductsByIndex(String index) {

        return getProductsByIndexInOrder(index).size();
    }

    public int numberOfProductByName(String product) {

        Map<String, List<String>> shoppingList = new HashMap<>(creationOfShoppingList());

        int counter = 0;
        for (String id : shoppingList.keySet()) {
            for (String item : shoppingList.get(id)) {
                if (item.equals(product)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public Map<String, Integer> numberOfAllProducts() {

        Map<String, List<String>> shoppingList = new HashMap<>(creationOfShoppingList());
        Set<String> products = new HashSet<>();
        Map<String, Integer> productsWithNumbers = new HashMap<>();

        for (String id : shoppingList.keySet()) {
            for (String item : shoppingList.get(id)) {
                products.add(item);
            }
        }

        for (String item : products) {
            productsWithNumbers.put(item, numberOfProductByName(item));
        }
        return productsWithNumbers;
    }

    public static void main(String[] args) {
        System.out.println(new ShoppingList().numberOfAllProducts());
    }
}