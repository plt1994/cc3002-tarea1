public class Rock implements Attackable {

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
        nothing();
    }

    @Override
    public void receivePriestAttack(Priest priest) {
        hurt(priest);
    }

    @Override
    public void receiveFireMageAttack(FireMage fireMage) {
        hurt(fireMage);
    }

    @Override
    public void receiveKnightAttack(Knight knight) {
        hurt(knight);
    }

    private void hurt(Human human) {
        human.hurt(human.getAP());
    }

    private void nothing() {
        System.out.println("Nothing happens");
    }
}
