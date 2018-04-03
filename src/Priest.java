public class Priest extends Human{
    public Priest(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Priest(){
        this(StandardHuman.PRIEST.getName(), StandardHuman.PRIEST.getHp(), StandardHuman.PRIEST.getAp());
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
