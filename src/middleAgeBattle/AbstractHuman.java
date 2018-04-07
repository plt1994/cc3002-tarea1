package middleAgeBattle;

/**
 * A Human is an attackable that have a name and dreams <3
 * @author plt1994
 */
public abstract class AbstractHuman extends AbstractAttacker implements IHuman {
    private String name;

    /**
     * AbstractHuman constructor, to make other humans constructors easier
     * @param name human's name
     * @param hp human's health points
     * @param ap human's attack points
     */
    protected AbstractHuman(String name, double hp, double ap){
        super(hp,ap);
        this.name = name;
    }

    @Override
    void setHP(double healthPoints) {
        this.healthPoints = healthPoints>StandardHuman.HUMAN.getHp()?StandardHuman.HUMAN.getHp():healthPoints;
    }

    /**
     * Give the name of this human being
     * @return an String with the name of this human
     */
    public String getName(){
        return name;
    }


}
