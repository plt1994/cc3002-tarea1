/**
 * Enum Class to give the standard initial HP and AP to Goblins, Ice Golems and Undeads
 */
public enum StandardEntity {
    GOBLIN(50,20), ICEGOLEM(10,10), UNDEAD(100,20);

    private double hp;
    private double ap;

    /**
     * @param hp Character's standard health points
     * @param ap Character's standard attack points
     */
    StandardEntity(double hp,double ap){
        this.hp = hp;
        this.ap = ap;
    }

    public double getHp(){
        return hp;
    }

    public double getAp(){
        return ap;
    }
}
