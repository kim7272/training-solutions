package virtualmethod.vehicle;

public class Vehicle {

    private int vehicleWeight;
    public static final int PERSON_AVERAGE_WEIGHT = 75;

    public Vehicle(int vehicleWeight){
        this.vehicleWeight = vehicleWeight;
    }
    public int getGrossLoad(){
        return PERSON_AVERAGE_WEIGHT + this.vehicleWeight;
    }
    public int getVehicleWeight(){
        return vehicleWeight;
    }
    @Override
    public String toString(){
        return "Vehicle{vehicleWeight="+ this.getVehicleWeight()+"}";
    }
}
