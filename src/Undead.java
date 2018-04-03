public class Undead extends Attacker {
    public Undead(double hp,double ap){
        super(hp,ap);
    }

    public Undead(){
        this(StandardEntity.UNDEAD.getHp(), StandardEntity.UNDEAD.getAp());
    }

    @Override
    void attack(Attackable attackable) {
        if(isAlive()){
            attackable.receiveUndeadAttack(this);
        }else{
            cantAttack();
        }

    }

    @Override
    public void receiveUndeadAttack(Undead undead) {
        nothing();
    }

    @Override
    public void receiveIceGolemAttack(IceGolem iceGolem) {
        this.hurt(iceGolem.getAP()*2);
    }

    @Override
    public void receiveGoblinAttack(Goblin goblin) {
        nothing();
    }

    @Override
    public void receivePriestAttack(Priest priest) {
        this.hurt(priest.getAP()*5);
    }

    @Override
    public void receiveFireMageAttack(FireMage fireMage) {
        this.hurt(fireMage.getAP()*0.5);
    }

    @Override
    public void receiveKnightAttack(Knight knight) {
        this.hurt(knight.getAP());
    }

}
