package MiddleAgeBattle;

public class FireMage extends Human{

    public FireMage(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public FireMage(){
        this(StandardHuman.FIREMAGE.getName(), StandardHuman.FIREMAGE.getHp(), StandardHuman.FIREMAGE.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()? attackable.receiveFireMageAttack(this):cantAttack();
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return this.hurt(goblin.getAP()*1.5);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP()*1.5);
    }
}
