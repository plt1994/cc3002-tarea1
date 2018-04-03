public class Knight extends Human{

    public Knight(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Knight(){
        this(StandardHuman.KNIGHT.getName(), StandardHuman.KNIGHT.getHp(), StandardHuman.KNIGHT.getAp());
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
