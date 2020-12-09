package week07d03;

import java.util.List;

public class NumberList {


    public boolean isIncreasing(List<Integer> list) {
        boolean b = true;
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i) > list.get(i + 1)) {
                b = false;
            }
        }
        return b;
    }
}
