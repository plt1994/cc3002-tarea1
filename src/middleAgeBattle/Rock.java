package middleAgeBattle;
/**
 * A rock is an special rock than will rock your head if you try to hit it, if you are human.
 * @author plt1994
 */
public class Rock extends AbstractAttackable {

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

    private boolean hurt(IHuman human) {
        return human.hurt(human.getAP());
    }

    @Override
    public boolean nothing() {
        System.out.println("Nothing happens");
        return false;
    }
}
