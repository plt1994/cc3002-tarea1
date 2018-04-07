package middleAgeBattle;

public class IceGolem extends Attacker{

    public IceGolem(double hp,double ap){
        super(hp, ap);
    }

    public IceGolem(){
        this(StandardEntity.ICEGOLEM.getHp(), StandardEntity.ICEGOLEM.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()? attackable.receiveIceGolemAttack(this):cantAttack();
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.ICEGOLEM.getHp()?StandardEntity.ICEGOLEM.getHp():healthPoints;

    }

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        return nothing();
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return this.hurt(iceGolem.getAP());
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return nothing();
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return this.hurt(fireMage.getAP()*5);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP()*0.5);
    }
}
