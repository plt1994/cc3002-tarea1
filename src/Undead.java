public class Undead extends Attacker {
    public Undead(double hp,double ap){
        super(hp,ap);
    }

    public Undead(){
        this(StandardEntity.UNDEAD.getHp(), StandardEntity.UNDEAD.getAp());
    }

    @Override
    public boolean attack(Attackable attackable) {
        return isAlive()? attackable.receiveUndeadAttack(this):cantAttack();
    }

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        return nothing();
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
        return this.hurt(priest.getAP()*5);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return this.hurt(fireMage.getAP()*0.5);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return this.hurt(knight.getAP());
    }

}
