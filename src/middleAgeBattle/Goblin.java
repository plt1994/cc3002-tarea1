package middleAgeBattle;

/**
 * A goblin is an attacker that can attack Attackable objects
 * @author plt1994
 */
public class Goblin extends Attacker{

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
    public boolean attack(Attackable attackable) {
        return isAlive()?attackable.receiveGoblinAttack(this):cantAttack();
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
