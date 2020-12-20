package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    private CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers){
        this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    public int loadPassenger(int passengers){
        return canCarryPassengers.loadPassenger(passengers);
    }

    public int getPassengers(){
        return canCarryPassengers.getPassengers();
    }

}


