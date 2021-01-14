package exceptions.polinom;

import static java.lang.Math.pow;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null){
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientStrs){
        if (coefficientStrs == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
         try {
            this.coefficients = convertCoefficientStrs(coefficientStrs);
         }
         catch (NumberFormatException ex) {
             throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x){
        double result = 0.0;
        int n = coefficients.length - 1;
        for (int i = coefficients.length - 1; i > -1; i--){
            result = result + coefficients[i] * pow(x,n-i);
        }
        return result;
    }

    public double[] convertCoefficientStrs(String[] coefficientStrs){
        double[] coefficients = new double[coefficientStrs.length];
        for (int i = 0; i < coefficientStrs.length; i++){
            coefficients[i] = Double.parseDouble(coefficientStrs[i]);
        }
        return coefficients;
    }
}



