import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    static Knight knight;
    static FireMage fireMage;
    static Priest priest;
    static Goblin goblin;
    static IceGolem iceGolem;
    static Undead undead;
    static FruitTree fruitTree;
    static Rock rock;
    static Undead undeadTest;

    @BeforeClass
    public static void init() throws  Exception {
        knight = new Knight();
        fireMage = new FireMage();
        priest = new Priest();
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
        fruitTree = new FruitTree();
        rock = new Rock();
    }
    @Before
    public void setUp() throws Exception {
        undeadTest = new Undead();
    }


    @Test
    public void defaultConstructorTest() {
        assertEquals(new Knight().getHP(),1000,0.0);
        assertEquals(new FireMage().getHP(),1000,0.0);
        assertEquals(new Priest().getHP(),1000,0.0);
        assertEquals(new Goblin().getHP(),500,0.0);
        assertEquals(new IceGolem().getHP(),2000,0.0);
        assertEquals(new Undead().getHP(),800,0.0);
        assertEquals(new Knight().getAP(),150,0.0);
        assertEquals(new FireMage().getAP(),100,0.0);
        assertEquals(new Priest().getAP(),50,0.0);
        assertEquals(new Goblin().getAP(),50,0.0);
        assertEquals(new IceGolem().getAP(),10,0.0);
        assertEquals(new Undead().getAP(),20,0.0);
        assertEquals(new Knight().getName(),"Knight");
        assertEquals(new FireMage().getName(),"Fire Mage");
        assertEquals(new Priest().getName(),"Priest");
    }

    @Test
    public void constructorTest() {
        Knight k = new Knight("k",1,2);
        FireMage f = new FireMage("f",1,2);
        Priest p = new Priest("p",1,2);
        Goblin g = new Goblin(1,2);
        IceGolem i = new IceGolem(1,2);
        Undead u = new Undead(1,2);
        assertEquals(k.getHP(),1,0.0);
        assertEquals(f.getHP(),1,0.0);
        assertEquals(p.getHP(),1,0.0);
        assertEquals(g.getHP(),1,0.0);
        assertEquals(i.getHP(),1,0.0);
        assertEquals(u.getHP(),1,0.0);
        assertEquals(k.getAP(),2,0.0);
        assertEquals(f.getAP(),2,0.0);
        assertEquals(p.getAP(),2,0.0);
        assertEquals(g.getAP(),2,0.0);
        assertEquals(i.getAP(),2,0.0);
        assertEquals(u.getAP(),2,0.0);
        assertEquals(k.getName(),"k");
        assertEquals(f.getName(),"f");
        assertEquals(p.getName(),"p");

    }

    @Test
    public void undeadTest() {
        Undead testCharacter = new Undead();
        assertFalse(goblin.attack(testCharacter));
        assertEquals(testCharacter.getHP(),800,0.0);
        assertFalse(undead.attack(testCharacter));
        assertEquals(testCharacter.getHP(),800,0.0);
        assertTrue(knight.attack(testCharacter));
        assertEquals(testCharacter.getHP(),650,0.0);
        assertTrue(fireMage.attack(testCharacter));
        assertEquals(testCharacter.getHP(),600,0.0);
        assertTrue(priest.attack(testCharacter));
        assertEquals(testCharacter.getHP(),350,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        assertEquals(testCharacter.getHP(),330,0.0);
        Knight killer = new Knight("killer",1,350);
        killer.attack(testCharacter);
        assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void fireMageTest() {
        FireMage testCharacter = new FireMage();
        assertTrue(goblin.attack(testCharacter));
        assertEquals(testCharacter.getHP(),925,0.0);
        assertTrue(undead.attack(testCharacter));
        assertEquals(testCharacter.getHP(),905,0.0);
        assertTrue(knight.attack(testCharacter));
        assertEquals(testCharacter.getHP(),680,0.0);
        assertTrue(fireMage.attack(testCharacter));
        assertEquals(testCharacter.getHP(),480,0.0);
        assertFalse(priest.attack(testCharacter));
        assertEquals(testCharacter.getHP(),480,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        assertEquals(testCharacter.getHP(),460,0.0);
        Undead killer = new Undead(1,480);
        killer.attack(testCharacter);
        assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void priestTest() {
        Priest testCharacter = new Priest();
        assertTrue(goblin.attack(testCharacter));
        assertEquals(testCharacter.getHP(),950,0.0);
        assertTrue(undead.attack(testCharacter));
        assertEquals(testCharacter.getHP(),930,0.0);
        assertFalse(knight.attack(testCharacter));
        assertEquals(testCharacter.getHP(),930,0.0);
        assertTrue(fireMage.attack(testCharacter));
        assertEquals(testCharacter.getHP(),730,0.0);
        assertFalse(priest.attack(testCharacter));
        assertEquals(testCharacter.getHP(),730,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        assertEquals(testCharacter.getHP(),710,0.0);
        Undead killer = new Undead(1,710);
        killer.attack(testCharacter);
        assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }
}
