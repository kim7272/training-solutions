package week11d01;

public class DivisorFinder {

    public int findDivisors(int n){
        int counter = 0;
        String s = Integer.toString(n);
        String[] array = s.split("");
        for (String number : array){
            if (n % Integer.parseInt(number) == 0){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new DivisorFinder().findDivisors(333));
    }
}
