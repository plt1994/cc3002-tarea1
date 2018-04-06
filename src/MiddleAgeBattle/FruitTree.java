package MiddleAgeBattle;

public class FruitTree implements Attackable {
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

    @Override
    public boolean nothing() {
        System.out.println("Nothing happens");
        return false;
    }

    /**
     * Heals a human, i.e. fireMage, priest or knight, giving an apple from its branches
     * @param human it could be a fireMage, priest or knight
     * @return true always even if the human's hp doesn't change
     */
    private boolean healHuman(Human human) {
        return human.heal(StandardHuman.HUMAN.getHp()*0.30);
    }
}