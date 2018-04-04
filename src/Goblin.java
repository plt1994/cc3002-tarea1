public class Goblin extends Attacker{

    public Goblin(double hp,double ap){
        super(hp,ap);
    }

    public Goblin(){
        this(StandardEntity.GOBLIN.getHp(), StandardEntity.GOBLIN.getAp());
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
