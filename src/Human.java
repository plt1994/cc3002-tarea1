public abstract class Human extends Attacker{
    private String name;

    public Human(String name, double hp,double ap){
        super(hp,ap);
        this.name = name;
    }


}
