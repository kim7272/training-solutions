package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {


    protected Point position;
    protected int hitPoint = 100;
    protected Random rdn = new Random();


    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isAlive(){
        if (getHitPoint() > 0){
            return true;
        }
        return false;
    }

    protected int getActualPrimaryDamage(){
      int  value = rdn.nextInt(10) + 1;
      return value;
    }

    private int getActualDefence() {
        int value = rdn.nextInt(6);
        return value;
    }

    protected void hit (Character enemy,int damage){
         if (getActualDefence() < damage) {
            decreaseHitPoint(damage);
         }
    }

    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }

   private void decreaseHitPoint ( int diff){
        hitPoint = hitPoint - diff;
   }

   public abstract void secondaryAttack(Character enemy);

}

