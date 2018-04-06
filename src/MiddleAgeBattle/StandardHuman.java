package MiddleAgeBattle;

/**
 * Enum Class to give the standard initial HP and AP to Humans i.e Knights, FireMages and Priests
 */
public enum StandardHuman {
    HUMAN("MiddleAgeBattle.Human",1000,1000),
    KNIGHT("MiddleAgeBattle.Knight",1000,150), FIREMAGE("Fire Mage",1000,100), PRIEST("MiddleAgeBattle.Priest",1000,50);

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
