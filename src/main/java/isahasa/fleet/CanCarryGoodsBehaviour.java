package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight){
        this.maxCargoWeight = maxCargoWeight;
    }

    public int loadCargo(int weight) {
        int remaining = weight - maxCargoWeight;
        if (remaining <= 0) {
            this.cargoWeight = weight;
            return 0;
        } else {
            this.cargoWeight = this.maxCargoWeight;
            return remaining;
        }
    }

    @Override
    public int getCargoWeight(){
        return cargoWeight;
    }
}
