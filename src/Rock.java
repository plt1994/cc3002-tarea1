public class Rock implements Attackable {

    @Override
    public boolean receiveUndeadAttack(Undead undead) {
        nothing();
    }

    @Override
    public boolean receiveIceGolemAttack(IceGolem iceGolem) {
        nothing();
    }

    @Override
    public boolean receiveGoblinAttack(Goblin goblin) {
        nothing();
    }

    @Override
    public boolean receivePriestAttack(Priest priest) {
        hurt(priest);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        hurt(fireMage);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        hurt(knight);
    }

    private boolean hurt(Human human) {
        human.hurt(human.getAP());
    }

    private boolean nothing() {
        System.out.println("Nothing happens");
    }
}
