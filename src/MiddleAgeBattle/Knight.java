package MiddleAgeBattle;

public class Knight extends Human{

    public Knight(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Knight(){
        this(StandardHuman.KNIGHT.getName(), StandardHuman.KNIGHT.getHp(), StandardHuman.KNIGHT.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()? attackable.receiveKnightAttack(this):cantAttack();
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return this.hurt(iceGolem.getAP()*1.5);
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return this.hurt(goblin.getAP()*0.5);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP());
    }
}
