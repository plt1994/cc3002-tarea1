public abstract class Human extends Attacker{
    private String name;

    protected Human(String name, double hp,double ap){
        super(hp,ap);
        this.name = name;
    }


}
