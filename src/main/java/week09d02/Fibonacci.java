package week09d02;

public class Fibonacci {

        public long fin(int n){
            if (n == 0){
                return 0;
            }
            else if (n==1){
                return 1;
            }
            else {
                Fibonacci fibonacci = new Fibonacci();
                long result = fibonacci.fin(n-1) + fibonacci.fin(n-2);
                return result;
            }
        }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fin(9));
    }
    }
