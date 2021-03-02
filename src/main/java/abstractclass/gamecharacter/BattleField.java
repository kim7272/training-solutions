package abstractclass.gamecharacter;

public class BattleField{

    private Archer archer;
    private AxeWarrior axeWarrior;

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
            return true;
        }
        return false;
    }

    public Character fight(Character one, Character other) {
        while (oneHit(one, other) && oneHit(other, one)){
            oneHit(other, one);
            oneHit(one, other);
            round = round + 1;
        }
        if (one.isAlive()){
            return one;
        }
        else {
            return other;
        }
    }
}



