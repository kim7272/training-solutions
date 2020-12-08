package week07d02;

public class DigitSum {


    public int sumOfDigits(int x){
       String s = Integer.toString(x);
       int sum = 0;
       for (int i = 0; i < s.length(); i++ ){
          char c = (s.charAt(i));
          sum = sum + Character.getNumericValue(c);
       }
       return sum;
    }

}
