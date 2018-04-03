public abstract class Attacker implements Attackable {
    private double healthPoints;
    private double attackPoints;


    public Attacker(double hp,double ap){
        setHP(hp);
        setAP(ap);
    }

    public Attacker(){
        this(0,0);
    }

    abstract void attack(Attackable attackable);

    public boolean isAlive(){
        return getHP()>0;
    }

    public void cantAttack(){
        System.out.println("This character cannot attack, is probably dead");
    }

    public void nothing(){
        System.out.println("Nothing happens");
    }

    public void hurt(double damage){
        setHP(getHP()>damage? getHP()-damage:0);
    }

    public void heal(double heal){
        setHP(getHP()+heal);
    }

    private void setHP(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    private double getHP() {
        return healthPoints;
    }

    private void setAP(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getAP() {
        return attackPoints;
    }




}
