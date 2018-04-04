public class FireMage extends Human{

    public FireMage(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public FireMage(){
        this(StandardHuman.FIREMAGE.getName(), StandardHuman.FIREMAGE.getHp(), StandardHuman.FIREMAGE.getAp());
    }

    @Override
    boolean attack(Attackable attackable) {
        return isAlive()? attackable.receiveFireMageAttack(this):cantAttack();
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
