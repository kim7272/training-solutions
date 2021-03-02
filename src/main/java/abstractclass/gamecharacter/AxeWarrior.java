package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    private Random random = new Random();

    public AxeWarrior(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    private int getActualSecondaryDamage(){
        return  rdn.nextInt(getActualPrimaryDamage()*2) + 1;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (this.position.distance(enemy.position) < 2){
            hit(enemy, getActualSecondaryDamage());

        }
    }
}


