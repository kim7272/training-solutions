package methodstructure.bmi;

public class BodyMass {

    private double height;
    private double weight;

    public BodyMass(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public double bodyMassIndex() {
        return weight / (height * height);
    }
    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        else if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        else {
            return BmiCategory.NORMAL;
        }
    }

    public boolean isThinnerThan(BodyMass bm1) {
       if (this.bodyMassIndex() < bm1.bodyMassIndex()) {
           return true;
       }
       else
           {
           return false;}
       }
}