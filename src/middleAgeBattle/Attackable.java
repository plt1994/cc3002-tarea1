package middleAgeBattle;

public interface Attackable {
    /**
     * Method to receive an attack from an middleAgeBattle.Undead
     * @param undead an middleAgeBattle.Undead that will attack this middleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveUndeadAttack(Undead undead);

    /**
     * Method to receive an attack from an middleAgeBattle.IceGolem
     * @param iceGolem an middleAgeBattle.IceGolem that will attack this middleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveIceGolemAttack(IceGolem iceGolem);

    /**
     * Method to receive an attack from a middleAgeBattle.Goblin
     * @param goblin a middleAgeBattle.Goblin that will attack this middleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveGoblinAttack(Goblin goblin);

    /**
     * Method to receive an attack from a middleAgeBattle.Priest
     * @param priest a middleAgeBattle.Priest that will attack this middleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receivePriestAttack(Priest priest);

    /**
     * Method to receive an attack from a middleAgeBattle.FireMage
     * @param fireMage a middleAgeBattle.FireMage that will attack this middleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveFireMageAttack(FireMage fireMage);

    /**
     * Method to receive an attack from a middleAgeBattle.Knight
     * @param knight a middleAgeBattle.Knight that will attack this middleAgeBattle.Attackable
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
