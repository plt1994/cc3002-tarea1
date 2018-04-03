public class FruitTree implements Attackable {
    @Override
    public void receiveUndeadAttack(Undead undead) {
        nothing();
    }

    @Override
    public void receiveIceGolemAttack(IceGolem iceGolem) {
        nothing();
    }

    @Override
    public void receiveGoblinAttack(Goblin goblin) {
        goblin.heal(StandardEntity.GOBLIN.getHp()*0.15);
    }

    @Override
    public void receivePriestAttack(Priest priest) {
        heal(priest);
    }

    @Override
    public void receiveFireMageAttack(FireMage fireMage) {
        heal(fireMage);
    }

    @Override
    public void receiveKnightAttack(Knight knight) {
        heal(knight);
    }

    private void nothing() {
        System.out.println("Nothing happens");
    }

    private void heal(Human human) {
        human.heal(StandardHuman.HUMAN.getHp()*0.30);
    }
}
