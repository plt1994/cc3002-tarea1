public abstract class Attacker implements Attackable {
    private double healthPoints;
    private double attackPoints;
    public static final double STANDARD_MAX_LIFE = 999;

    /**
     * Attacker's main constructor
     * @param hp Character's health points
     * @param ap Character's attack points
     */
    public Attacker(double hp,double ap){
        setHP(hp);
        setAP(ap);
    }

    /**
     * Attacker character's main action, attack an Attackable type, it interacts depending which Attackable
     * receive the attack.
     * @param attackable an Attackable type, might be Human(Knight, Fire Mage or Priest) or Goblin, Ice Golem, Undead.
     */
    abstract void attack(Attackable attackable);

    /**
     * Check if an Attacker has enough health points(greater than 0)
     * @return true if a character is alive (it has hp>0), false otherwise
     */
    public boolean isAlive(){
        return getHP()>0;
    }

    /**
     * Shows the console message: This character cannot attack, it's probably dead
     */
    public void cantAttack(){
        System.out.println("This character cannot attack, it's probably dead");
    }

    /**
     * Shows the console message: Nothing happens
     */
    public void nothing(){
        System.out.println("Nothing happens");
    }

    /**
     * Reduces the life of the character in the damage amount given, until a minimum of 0
     * @param damage amount of damage that this character receive
     */
    public void hurt(double damage){
        setHP(getHP()>damage? getHP()-damage:0);
    }

    /**
     * Cures the life of the character in the heal amount given, until a maximum of STANDARD_MAX_LIFE
     * @param heal amount of heal that this character receive
     */
    public void heal(double heal){
        //setHP(getHP()+heal);
        setHP(getHP()+heal<STANDARD_MAX_LIFE? getHP()+heal:STANDARD_MAX_LIFE);
    }

    /**
     * Health points setter, sets the healthPoints to STANDARD_MAX_LIFE if
     * the amount given is greater than STANDARD_MAX_LIFE
     * @param healthPoints
     */
    private void setHP(double healthPoints) {
        this.healthPoints = healthPoints>STANDARD_MAX_LIFE?STANDARD_MAX_LIFE:healthPoints;
    }

    /**
     * Health points getter
     * @return returns health points of this character
     */
    private double getHP() {
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




}
