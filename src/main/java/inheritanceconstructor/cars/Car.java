package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity){
        if (tankCapacity < fuel) {
        throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel = this.fuel + fuel;
    }

    public double getFuel(){
        return fuel;
    }
    public double getTankCapacity(){
        return tankCapacity;
    }
    public double getFuelRate(){
        return fuelRate;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public void drive(int km){
        if (km/100.0 * fuelRate > fuel){
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        this.fuel = this.fuel - km/100.0 * this.fuelRate;
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki

    public double calculateRefillAmount(){
        return this.tankCapacity - this.fuel;
    } //kiszámolja, mennyit lehet tankolni
}

