public class Goblin extends Attacker{

    public Goblin(double hp,double ap){
        super(hp,ap);
    }

    public Goblin(){
        this(StandardEntity.GOBLIN.getHp(), StandardEntity.GOBLIN.getAp());
    }

    @Override
    boolean attack(Attackable attackable) {
        return attackable.receiveGoblinAttack(this);
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.GOBLIN.getHp()?StandardEntity.GOBLIN.getHp():healthPoints;
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
