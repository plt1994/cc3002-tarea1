package MiddleAgeBattle;

public interface Attackable {
    /**
     * Method to receive an attack from an MiddleAgeBattle.Undead
     * @param undead an MiddleAgeBattle.Undead that will attack this MiddleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveUndeadAttack(Undead undead);

    /**
     * Method to receive an attack from an MiddleAgeBattle.IceGolem
     * @param iceGolem an MiddleAgeBattle.IceGolem that will attack this MiddleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveIceGolemAttack(IceGolem iceGolem);

    /**
     * Method to receive an attack from a MiddleAgeBattle.Goblin
     * @param goblin a MiddleAgeBattle.Goblin that will attack this MiddleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveGoblinAttack(Goblin goblin);

    /**
     * Method to receive an attack from a MiddleAgeBattle.Priest
     * @param priest a MiddleAgeBattle.Priest that will attack this MiddleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receivePriestAttack(Priest priest);

    /**
     * Method to receive an attack from a MiddleAgeBattle.FireMage
     * @param fireMage a MiddleAgeBattle.FireMage that will attack this MiddleAgeBattle.Attackable
     * @return true if it receives the attack, false if it cannot receive the attack
     * or if the attack does not do anything
     */
    boolean receiveFireMageAttack(FireMage fireMage);

    /**
     * Method to receive an attack from a MiddleAgeBattle.Knight
     * @param knight a MiddleAgeBattle.Knight that will attack this MiddleAgeBattle.Attackable
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
