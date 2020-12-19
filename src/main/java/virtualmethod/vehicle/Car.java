package virtualmethod.vehicle;

public class Car extends Vehicle {

    private int numberPassenger;

    public Car(int vehicleWeight, int numberPassenger) {
        super(vehicleWeight);
        this.numberPassenger = numberPassenger;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }
    @Override
    public int getGrossLoad(){
        return super.getGrossLoad() + this.numberPassenger * super.PERSON_AVERAGE_WEIGHT;
    }
    @Override
    public String toString(){
        return "Car{numberOfPassenger=" + numberPassenger +", vehicleWeight="+super.getVehicleWeight()+"}";
    }


}