package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String item){
        boolean b;
        if (item == null || item.isBlank()){
            return  true;
        }
        return false;
    }

    public static boolean isEmpty(List<String> items) {
        boolean b;
        if (items == null || items.isEmpty()) {
            return true;
        }
        return false;
    }
}