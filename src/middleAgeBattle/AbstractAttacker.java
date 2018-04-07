package middleAgeBattle;

/**
 * Attackers abstract class to describe attackers behavior
 * @author plt1994
 */
public abstract class AbstractAttacker implements IAttacker {
    protected double healthPoints;
    private double attackPoints;

    /**
     * middleAgeBattle.AbstractAttacker's main constructor
     * @param hp Character's health points
     * @param ap Character's attack points
     */
    public AbstractAttacker(double hp, double ap){
        setHP(hp);
        setAP(ap);
    }

    /**
     * middleAgeBattle.AbstractAttacker character's main action, attack an middleAgeBattle.IAttackable
     * type, it interacts depending which middleAgeBattle.IAttackable receive the attack.
     * @param IAttackable an middleAgeBattle.IAttackable type, might be middleAgeBattle.AbstractHuman(middleAgeBattle.Knight, Fire Mage or middleAgeBattle.Priest) or middleAgeBattle.Goblin, Ice Golem, middleAgeBattle.Undead.
     * @return true if the attack has been done, false otherwise
     */
    abstract boolean attack(IAttackable IAttackable);

    /**
     * Check if an middleAgeBattle.AbstractAttacker has enough health points(greater than 0)
     * @return true if a character is alive (it has hp greater than 0), false otherwise
     */
    public boolean isAlive(){
        return getHP()>0;
    }

    /**
     * Shows the console message: This character cannot attack, it's probably dead
     * @return return false always, it means than there is no attack
     */
    public boolean cantAttack(){
        System.out.println("This character cannot attack, it's probably dead");
        return false;
    }

    /**
     * Shows the console message: Nothing happens
     * @return return false always, it means than there is no attack
     */
    public boolean nothing(){
        System.out.println("Nothing happens");
        return false;
    }

    /**
     * Reduces the life of the character in the damage amount given, until a minimum of 0
     * @param damage amount of damage that this character receive
     * @return return true always, it means that damage was done
     */
    public boolean hurt(double damage){
        setHP(getHP()>damage? getHP()-damage:0);
        return true;
    }

    /**
     * Cures the life of the character in the heal amount given, until a maximum of STANDARD_MAX_LIFE
     * @param heal amount of heal that this character receive
     * @return return true always, it means that heal was done
     */
    public boolean heal(double heal){
        setHP(getHP()+heal);
        return true;
    }

    /**
     * Health points setter, sets the healthPoints to STANDARD_MAX_LIFE if
     * the amount given is greater than STANDARD_MAX_LIFE
     * @param healthPoints
     */
    abstract void setHP(double healthPoints);

    /**
     * Health points getter
     * @return returns health points of this character
     */
    public double getHP() {
        return healthPoints;
    }

    /**
     * Attack Points setter, it has no limits
     * @param attackPoints amount of attack points to give to this character
     */
    private void setAP(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * Attack Points getter
     * @return returns the attack points of this character
     */
    public double getAP() {
        return attackPoints;
    }

    @Override
    public boolean receiveUndeadAttack(Undead undead){
        return this.hurt(undead.getAP());
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return this.hurt(iceGolem.getAP()*2);
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return nothing();
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return this.hurt(fireMage.getAP()*2);
    }


}
