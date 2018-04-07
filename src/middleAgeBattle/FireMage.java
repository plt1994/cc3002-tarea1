package middleAgeBattle;

/**
 * A fire mage is a human that can attack Attackable objects
 * @author plt1994
 */
public class FireMage extends Human{

    /**
     * FireMage main constructor
     * @param name Character's name
     * @param hp Character's health points
     * @param ap Character's attack points
     */
    public FireMage(String name, double hp,double ap){
        super(name,hp,ap);
    }

    /**
     * FireMage standard constructor
     */
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
