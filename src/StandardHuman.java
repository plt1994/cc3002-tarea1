/**
 * Enum Class to give the standard initial HP and AP to Humans i.e Knights, FireMages and Priests
 */
public enum StandardHuman {
    HUMAN("Human",150,10),
    KNIGHT("Knight",150,50), FIREMAGE("Fire Mage",150,40), PRIEST("Priest",200,10);

    private String name;
    private double hp;
    private double ap;

    /**
     * @param name Character's standard name
     * @param hp Character's standard health points
     * @param ap Character's standard attack points
     */
    StandardHuman(String name, double hp,double ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName(){
        return name;
    }

    public double getHp(){
        return hp;
    }

    public double getAp(){
        return ap;
    }
}
