package middleAgeBattle;

/**
 * A fruit tree can give apples if a human or a goblin hit it
 * @author plt1994
 */
public class FruitTree extends AbstractAttackable {

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        return goblin.heal(StandardEntity.GOBLIN.getHp()*0.15);
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return healHuman(priest);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return healHuman(fireMage);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return healHuman(knight);
    }

    private boolean healHuman(IHuman human) {
        return human.heal(StandardHuman.HUMAN.getHp()*0.30);
    }
}
