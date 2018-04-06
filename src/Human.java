public abstract class Human extends Attacker{
    private String name;

    protected Human(String name, double hp,double ap){
        super(hp,ap);
        this.name = name;
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardHuman.HUMAN.getHp()?StandardHuman.HUMAN.getHp():healthPoints;
    }

    public String getName(){
        return name;
    }


}
