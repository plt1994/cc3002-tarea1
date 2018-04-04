public class Knight extends Human{

    public Knight(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Knight(){
        this(StandardHuman.KNIGHT.getName(), StandardHuman.KNIGHT.getHp(), StandardHuman.KNIGHT.getAp());
    }

    @Override
    boolean attack(Attackable attackable) {
        return false;
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
