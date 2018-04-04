public class Rock implements Attackable {

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

    @Override
    public boolean receivePriestAttack(Priest priest) {
        return hurt(priest);
    }

    @Override
    public boolean receiveFireMageAttack(FireMage fireMage) {
        return hurt(fireMage);
    }

    @Override
    public boolean receiveKnightAttack(Knight knight) {
        return hurt(knight);
    }

    private boolean hurt(Human human) {
        return human.hurt(human.getAP());
    }

    @Override
    public boolean nothing() {
        System.out.println("Nothing happens");
        return false;
    }
}
