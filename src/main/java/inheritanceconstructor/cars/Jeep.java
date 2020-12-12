package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel){
        super(fuelRate,fuel,tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraFuel(){
        return extraFuel;
    }

    @Override
    public double calculateRefillAmount(){
        return  (super.getTankCapacity() - super.getFuel())  + (this.extraCapacity - this.extraFuel);
    }

    @Override
    public void drive(int km){
       if (km/100 * super.getFuelRate() > super.getFuel() + this.extraFuel){
           throw new IllegalArgumentException("Not enough fuel available!");
       }
       else if (km/100 * super.getFuelRate() == this.extraFuel){
           this.extraFuel = 0;
       }
       else  {
           super.setFuel(super.getFuel() - (km/100 * super.getFuelRate()- this.extraFuel));
           this.extraFuel = 0;
       }
    }
}


