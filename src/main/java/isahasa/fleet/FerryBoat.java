package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {

        private CanCarryGoods canCarryGoods;
        private CanCarryPassengers canCarryPassengers;

        public FerryBoat(int maxCargoWeight, int maxPassengers){
                this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
                this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
        }

        public int loadPassenger(int passengers){
                return canCarryPassengers.loadPassenger(passengers);
        }

        public int getPassengers(){
                return canCarryPassengers.getPassengers();
        }

        public int loadCargo(int weight){
                return canCarryGoods.loadCargo(weight);
        }

        public int getCargoWeight(){
                return canCarryGoods.getCargoWeight();
        }
}
