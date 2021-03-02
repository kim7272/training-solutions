package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends  Character{

    private int numberOfArrow = 100;
    private Random random = new Random();

    public Archer(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage(){
        int value = rdn.nextInt(5) +1;
        return value;
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrow = numberOfArrow -1;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}


