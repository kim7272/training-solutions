package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public int loadPassenger(int passengers) {
        int remainer = passengers - this.maxPassengers;
        if (remainer <= 0) {
            this.passengers = passengers;
            return 0;
        } else {
            this.passengers = this.maxPassengers;
            return remainer;
        }
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }
}
