package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capsules {
List<String> colors = new ArrayList<>();

public void addLast(String element){
   colors.add(element);
}
public void addFirst(String element){
    colors.add(0,element);
}
public void removeFirst(){
    colors.remove(0);
}
public void removeLast() {
    colors.remove(colors.size()-1);
}
  public  List<String> getColors(){
    return colors;
    }

    public static void main(String[] args) {
    Capsules capsules = new Capsules();
    capsules.addLast("blue");
    capsules.addLast("white");
    capsules.addLast("green");
    capsules.addLast("black");
    capsules.addLast("red");
    System.out.println(capsules.getColors());
    capsules.addFirst("yellow");
    System.out.println(capsules.getColors());
    capsules.removeFirst();
    System.out.println(capsules.getColors());
    capsules.removeLast();
    System.out.println(capsules.getColors());
    System.out.println(capsules.getColors());
    }
}