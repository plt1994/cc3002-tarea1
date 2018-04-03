public class Goblin extends Attacker{

    public Goblin(double hp,double ap){
        super(hp,ap);
    }

    public Goblin(){
        this(StandardEntity.GOBLIN.getHp(), StandardEntity.GOBLIN.getAp());
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
