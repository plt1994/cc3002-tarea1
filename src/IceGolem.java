public class IceGolem extends Attacker{

    public IceGolem(double hp,double ap){
        super(hp, ap);
    }

    public IceGolem(){
        this(StandardEntity.ICEGOLEM.getHp(), StandardEntity.ICEGOLEM.getAp());
    }

    @Override
    void attack(Attackable attackable) {

    }

    @Override
    public void receiveUndeadAttack(Undead undead) {

    }

    @Override
    public void receiveIceGolemAttack(IceGolem iceGolem) {

    }

    @Override
    public void receiveGoblinAttack(Goblin goblin) {

    }

    @Override
    public void receivePriestAttack(Priest priest) {

    }

    @Override
    public void receiveFireMageAttack(FireMage fireMage) {

    }

    @Override
    public void receiveKnightAttack(Knight knight) {

    }
}
