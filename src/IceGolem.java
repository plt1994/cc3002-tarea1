public class IceGolem extends Attacker{

    public IceGolem(double hp,double ap){
        super(hp, ap);
    }

    public IceGolem(){
        this(StandardEntity.ICEGOLEM.getHp(), StandardEntity.ICEGOLEM.getAp());
    }

    @Override
    boolean attack(Attackable attackable) {

    }

    @Override
    public boolean receiveUndeadAttack(Undead undead) {

    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {

    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {

    }

    @Override
    public boolean receivePriestAttack(Priest priest) {

    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {

    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {

    }
}
