public interface Attackable {
    /**
     * Method to receive an attack from an Undead
     * @param undead an Undead that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveUndeadAttack(Undead undead);

    /**
     * Method to receive an attack from an IceGolem
     * @param iceGolem an IceGolem that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveIceGolemAttack(IceGolem iceGolem);

    /**
     * Method to receive an attack from a Goblin
     * @param goblin a Goblin that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveGoblinAttack(Goblin goblin);

    /**
     * Method to receive an attack from a Priest
     * @param priest a Priest that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receivePriestAttack(Priest priest);

    /**
     * Method to receive an attack from a FireMage
     * @param fireMage a FireMage that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveFireMageAttack(FireMage fireMage);

    /**
     * Method to receive an attack from a Knight
     * @param knight a Knight that will attack this Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveKnightAttack(Knight knight);

    /**
     * Shows the console message: Nothing happens
     * @return return false always, it means than there is no attack
     */
    boolean nothing();

}
