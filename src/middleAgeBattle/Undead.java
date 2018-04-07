package middleAgeBattle;

/**
 * Its not dead, that's what we think
 * @author plt1994
 */
public class Undead extends AbstractAttacker {
    /**
     * Undead main constructor
     * @param hp health points
     * @param ap attack points
     */
    public Undead(double hp,double ap){
        super(hp,ap);
    }

    /**
     * Undead standard constructor
     */
    public Undead(){
        this(StandardEntity.UNDEAD.getHp(), StandardEntity.UNDEAD.getAp());
    }

    @Override
    public boolean attack(IAttackable IAttackable) {
        return isAlive()? IAttackable.receiveUndeadAttack(this):cantAttack();
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.UNDEAD.getHp()?StandardEntity.UNDEAD.getHp():healthPoints;
    }

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        return nothing();
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return nothing();
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return this.hurt(priest.getAP()*5);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return this.hurt(fireMage.getAP()*0.5);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP());
    }

}
