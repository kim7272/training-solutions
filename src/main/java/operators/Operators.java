package operators;

public class Operators {

    int n;

    public Operators(){};

    boolean isEven(int n) {
        boolean b;
        if (n % 2 == 0) {
            b = true;
        } else {
            b = false;}
        return b; }


    int mulitplyByPowerOfTwo(int basis, int twoPower){
        int result;
        String number = Integer.toBinaryString(basis << twoPower);
        result = Integer.parseInt(number,2);
        return result;
    }
}

