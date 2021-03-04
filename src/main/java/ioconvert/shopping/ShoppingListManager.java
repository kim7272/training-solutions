package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> shoppingList) {

        try (PrintStream ps = new PrintStream(new BufferedOutputStream(os))) {
            for (String shopping : shoppingList) {
                ps.println(shopping);
            }
        }
    }

    public <String> List loadShoppingList(InputStream is) {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = (String) br.readLine())  != null) {
                result.add(line);
            }
        }
        catch (IOException e){
            throw new IllegalStateException("Can not read file!", e);
        }
        return result;
    }
}


