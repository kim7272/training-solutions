package week08d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {
    List<String> first = new ArrayList<>();
    List<String> second = new ArrayList<>();


    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> union = new ArrayList<>();

        for (int i = 0; i < second.size(); i++){
            if (!first.contains(second.get(i))){
                first.add(second.get(i));
            }
            union = first;
        }
        return union;
    }
}


