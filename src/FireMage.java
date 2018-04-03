public class FireMage extends Human{

    public FireMage(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public FireMage(){
        this(StandardHuman.FIREMAGE.getName(), StandardHuman.FIREMAGE.getHp(), StandardHuman.FIREMAGE.getAp());
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
