package week02d02;

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the type of the first phone!");
        String type = scanner.nextLine();
        System.out.println("Give me the memory of the first phone!");
        int mem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me the type of the second phone!");
        String type2 = scanner.nextLine();
        System.out.println("Give me the memory of the second phone!");
        int mem2 = scanner.nextInt();

        Phone phone = new Phone(type, mem);
        Phone phone2 = new Phone(type2, mem2);
        System.out.print(phone.getType() + " ");
        System.out.println(phone.getMem());
        System.out.print(phone2.getType() + " ");
        System.out.println(phone2.getMem());
    }
}
