package MiddleAgeBattle;

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
    public boolean receiveUndeadAttack(Undead undead) {
        return this.hurt(undead.getAP());
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return this.hurt(iceGolem.getAP()*2);
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return this.hurt(goblin.getAP());
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return nothing();
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return this.hurt(fireMage.getAP()*2);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return nothing();
    }
}
