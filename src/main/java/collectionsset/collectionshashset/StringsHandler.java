package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection){

        Set<String> uniqueStrings = new HashSet<>();
        for (String soleString : stringCollection){
            uniqueStrings.add(soleString);
        }
        return uniqueStrings;
    }


    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB){

        Set<String> identicalString = new HashSet<>();
        for (String soleString : setA){
            if (setB.contains(soleString)){
                identicalString.add(soleString);
            }
        }
        return identicalString;
    }
}
