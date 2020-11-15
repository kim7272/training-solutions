package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1" +  "2");
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        double quotient = 3/4;
        System.out.println(quotient);

        float quotient2 = 3/4F;
        System.out.println(quotient2);

        double quotient3 = 3/4D;
        System.out.println(quotient3);

        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = "title".toUpperCase();
        System.out.println(word);

        int a = 1;
        System.out.println(Integer.toBinaryString(a));

        int b = -2;
        System.out.println(Integer.toBinaryString(b));

    }
}
