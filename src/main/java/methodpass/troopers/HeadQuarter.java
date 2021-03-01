 package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers(){
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        Trooper selected = findTrooperByName(name);
        selected.changePosition(target);
    }

    public void moveClosestTrooper(Position target){
        Trooper selected = findClosestTrooper(target);
        selected.changePosition(target);
    }

    private Trooper findTrooperByName(String name) {
        Trooper selected = troopers.get(0);
        for (Trooper trooper : troopers) {
            if (trooper.getName() == name) {
                selected = trooper;
            }
        }
        return selected;
    }

    private Trooper findClosestTrooper(Position target){
        Trooper result = troopers.get(0);
        for (int i = 1; i < troopers.size(); i++) {
            if (troopers.get(i).distanceFrom(target) < result.distanceFrom(target)){
               result = troopers.get(i);
            }
        }
        return result;
    }
}