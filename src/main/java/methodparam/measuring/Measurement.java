package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values){
        this.values = values;
    }
    public int findFirstIndexInLimit(int lower, int upper){
        int i;
        for (i = 0; i < values.length-1; i++){
            if (values[i] > lower && values[i] < upper){
                break;
            }
        }
            if (values[i]  > lower && values[i] < upper){
                return i;
            }
            else {
                return -1;
            }
        }

    public double minimum(){
        double minValue = values[0];
        for (double valueChecked : values){
            if (valueChecked < minValue){
                minValue = valueChecked;
            }
        }
            return minValue;
    }

    public double maximum(){
        double maxValue = values[0];
        for (double valueChecked : values){
            if (valueChecked  > maxValue){
                maxValue = valueChecked;
            }
        }
        return maxValue;
    }

    public ExtremValues minmax(){
        ExtremValues result = new ExtremValues(new Measurement(values).minimum(),new Measurement(values).maximum());
        return result;
    }

}

