package middleAgeBattle;
/**
 * A knight is a human that can attack IAttackable objects, but not priest! never!
 * @author plt1994
 */
public class Knight extends AbstractHuman {

    /**
     * Knight main constructor
     * @param name name of the knight
     * @param hp health points of the knight
     * @param ap attack of the knight
     */
    public Knight(String name, double hp,double ap){
        super(name,hp,ap);
    }

    /**
     * knight standard constructor
     */
    public Knight(){
        this(StandardHuman.KNIGHT.getName(), StandardHuman.KNIGHT.getHp(), StandardHuman.KNIGHT.getAp());
    }

    @Override
    public boolean attack(IAttackable IAttackable) {
        return isAlive()? IAttackable.receiveKnightAttack(this):cantAttack();
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
