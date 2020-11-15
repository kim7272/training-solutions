
package typeconversion.dataloss;

public class DataLoss {

    public void dataLoss() {
        long beginning = 0;
        for (long i = 0; i < 3; ) {
            long result = (long) (float) beginning;
            if (result != beginning) {
                System.out.println("Beginning: " + beginning + " binaryVersion: " + Long.toBinaryString(beginning));
                System.out.println("Result: " + result + " binaryVersion: " + Long.toBinaryString(result));
                i++;
            }
            beginning++;
        }
    }

    public static void main(String[] args) {
        DataLoss dataLoss = new DataLoss();
        dataLoss.dataLoss();
    }
}