package isahasa.fleet;

public class CargoShip implements Ship, CanCarryGoods {

        private CanCarryGoods canCarryGoods;

        public CargoShip(int maxCargoWeight){
            this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
        }

        public int loadCargo(int weight){
            return canCarryGoods.loadCargo(weight);
        }

        public int getCargoWeight(){
             return canCarryGoods.getCargoWeight();
        }

}
