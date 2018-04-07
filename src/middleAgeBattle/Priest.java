package middleAgeBattle;

/**
 * A Priest is a human that can attack Attackable objects... does he can? yeah
 * but just Undeads, Fruit trees and Rock (y) he is a good guy
 * @author plt1994
 */
public class Priest extends Human{
    /**
     * Priest main constructor
     * @param name Character's name
     * @param hp Character's health points
     * @param ap Character's attack points
     */
    public Priest(String name, double hp,double ap){
        super(name,hp,ap);
    }

    /**
     * Priest standard constructor
     */
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
