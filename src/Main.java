public class Main {

    public static void main(String[] args){
        Undead undead = new Undead();
        undead.attack(new FruitTree());
        System.out.println(undead.getHP());
    }
}
