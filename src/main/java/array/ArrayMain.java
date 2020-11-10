package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(week[1]);
        System.out.println(week.length);

        int[] powerCount = new int[5];
        for (int i = 0; i < powerCount.length; i++) {
            powerCount[i] = (int) Math.pow(2, i);
            System.out.println(powerCount[i]);
        }
        ;

        boolean[] change = {false, true, false, true, false, true};
        for (int i = 0; i < change.length; i++) {
            System.out.println(change[i]);};
    }
}





