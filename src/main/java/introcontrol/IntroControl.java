package introcontrol;

public class IntroControl {


    public int substractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

        public String describeNumber(int number) {
            if (number == 0) {
                return "zero";
            } else {
                return "not zero";
            }
        }
        public String greetingToJoe(String name) {
             if (name.equals("Joe")) {
                 return "Hello Joe!";
             } else {
                 return "";
             }

        }
        public int calculateBonus(int sale){
            if (sale >= 1000000) {
                return sale/10;
            } else {
                return 0;
            }
            }
        public int calculateConsumption(int prev, int next) {
            if (next< prev) {
                return (9999+next)-prev;
            } else {
                return next - prev;
            }
            }
        public void printNumbers(int max) {
           for (int i = 1; i <= max; i++) {
               System.out.println(i);}
           }
        public void printNumbersBetween(int min, int max) {
            for (int i = min+1; i < max; i++) {
                System.out.println(i);}
            }
        public void printNumbersBetweenAnyDirection(int a, int b) {
            if (b > a) {
                for (int i = a + 1; i < b; i++) {
                    System.out.println(i);
                }
            }
                else {
                for (int i = a - 1; i > b; i--) {
                    System.out.println(i);
                    }
                }
            }
        public void printOddNumbers(int max) {
            for (int i = 1; i <= max; i++) {
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }

        }
        }




















