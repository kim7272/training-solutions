package week08d01;

public class Robot {


    public int[] move(String string) {
        int[] position = new int[2];
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) != 'F') &&
                (string.charAt(i) != 'L') &&
               (string.charAt(i) != 'J') &&
               (string.charAt(i) != 'B')) {
            throw new IllegalArgumentException("Rossz adatmegadás!");
            }

            if (string.charAt(i) == 'F') {
                position[1]++;
            }
            if (string.charAt(i) == 'L') {
                position[1]--;
            }
            if (string.charAt(i) == 'J') {
                position[0]++;
            }
            if (string.charAt(i) == 'B') {
                position[0]--;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println(new Robot().move("XY")[0] + " " + new Robot().move("XY")[1]);
    }
}



