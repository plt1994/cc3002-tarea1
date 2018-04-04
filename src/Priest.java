public class Priest extends Human{
    public Priest(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Priest(){
        this(StandardHuman.PRIEST.getName(), StandardHuman.PRIEST.getHp(), StandardHuman.PRIEST.getAp());
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
