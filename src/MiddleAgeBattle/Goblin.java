package MiddleAgeBattle;

public class Goblin extends Attacker{

    public Goblin(double hp,double ap){
        super(hp,ap);
    }

    public Goblin(){
        this(StandardEntity.GOBLIN.getHp(), StandardEntity.GOBLIN.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()?attackable.receiveGoblinAttack(this):cantAttack();
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardEntity.GOBLIN.getHp()?StandardEntity.GOBLIN.getHp():healthPoints;
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
        return nothing();
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
        return this.hurt(knight.getAP()*1.25);
    }
}
