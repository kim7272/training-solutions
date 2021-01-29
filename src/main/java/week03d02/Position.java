package week03d02;

import java.util.Arrays;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return  "name = " + name +
                " bonus= " + bonus;
    }

    public static void main(String[] args) {
        List<Position> positions = Arrays.asList(new Position("Bob",12000), new Position("Fred",155000),
        new Position("Jack", 165000),new Position("Joe", 118000),new Position("Bill", 182000));

    for (Position position : positions){
        if (position.bonus > 150000){
            System.out.println(position);
        }
    }
  }
}
