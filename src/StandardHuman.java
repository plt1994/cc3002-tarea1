public enum StandardHuman {
    HUMAN("Human",10,10),
    KNIGHT("Knight",10,10), FIREMAGE("Fire Mage",10,10), PRIEST("Priest",10,10);

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
