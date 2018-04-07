package middleAgeBattle;

public class Priest extends Human{
    public Priest(String name, double hp,double ap){
        super(name,hp,ap);
    }

    public Priest(){
        this(StandardHuman.PRIEST.getName(), StandardHuman.PRIEST.getHp(), StandardHuman.PRIEST.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()?attackable.receivePriestAttack(this):cantAttack();
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return this.hurt(goblin.getAP());
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return nothing();
    }
}
