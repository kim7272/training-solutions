package week09d03;

import java.util.Random;

public class Person {

    private Present present;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Present getPresent() {
        return present;
    }
    @Override
    public String toString() {
        return "(" + getPresent()+ " ) ,";
    }

    Present[] allPresents = Present.values();

    public Present setPresent() {
       Present[] allPresents = Present.values();
        if (this.age > 14) {
            this.present = allPresents[new Random(5).nextInt(3) + 1];
        } else {
            this.present = allPresents[new Random(10).nextInt(4)];
        }
        return this.present;
    }

}

