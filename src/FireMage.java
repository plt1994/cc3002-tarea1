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
    void setHP(double healthPoints) {

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
