package middleAgeBattle;

/**
 * Attacker interface, to define behavior and good design
 * @author plt1994
 */
public interface IAttacker extends IAttackable {
    boolean heal(double heal);
    boolean hurt(double hurt);
    double getAP();
}
