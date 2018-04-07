package middleAgeBattle;

/**
 * A goblin is an attacker that can attack IAttackable objects
 * @author plt1994
 */
public class Goblin extends AbstractAttacker {

    /**
     * Goblin main constructor
     * @param hp Character's health points
     * @param ap Character's attack points
     */
    public Goblin(double hp,double ap){
        super(hp,ap);
    }

    /**
     * Goblin standard constructor
     */
    public Goblin(){
        this(StandardEntity.GOBLIN.getHp(), StandardEntity.GOBLIN.getAp());
    }

    @Override
    public boolean attack(IAttackable IAttackable) {
        return isAlive()? IAttackable.receiveGoblinAttack(this):cantAttack();
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.GOBLIN.getHp()?StandardEntity.GOBLIN.getHp():healthPoints;
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return nothing();
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP()*1.25);
    }
}
