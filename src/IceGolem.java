public class IceGolem extends Attacker{

    public IceGolem(double hp,double ap){
        super(hp, ap);
    }

    public IceGolem(){
        this(StandardEntity.ICEGOLEM.getHp(), StandardEntity.ICEGOLEM.getAp());
    }

    @Override
    boolean attack(Attackable attackable) {
        return attackable.receiveIceGolemAttack(this);
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.ICEGOLEM.getHp()?StandardEntity.ICEGOLEM.getHp():healthPoints;

    }

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        return false;
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return false;
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return false;
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return false;
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return false;
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return false;
    }
}
