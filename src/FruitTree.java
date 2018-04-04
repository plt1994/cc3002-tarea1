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
        return heal(priest);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return heal(fireMage);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return heal(knight);
    }

    private boolean nothing() {
        System.out.println("Nothing happens");
        return false;
    }

    private boolean heal(Human human) {
        return human.heal(StandardHuman.HUMAN.getHp()*0.30);
    }
}
