package middleAgeBattle;

/**
 * Attackable abstract class to define similar behaviors
 * @author plt1994
 */
public abstract class AbstractAttackable implements IAttackable{

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        return nothing();
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        return nothing();
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return nothing();
    }

}
