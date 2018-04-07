package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import middleAgeBattle.*;

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
        Assert.assertEquals(new Knight().getHP(),1000,0.0);
        Assert.assertEquals(new FireMage().getHP(),1000,0.0);
        Assert.assertEquals(new Priest().getHP(),1000,0.0);
        Assert.assertEquals(new Goblin().getHP(),500,0.0);
        Assert.assertEquals(new IceGolem().getHP(),2000,0.0);
        Assert.assertEquals(new Undead().getHP(),800,0.0);
        Assert.assertEquals(new Knight().getAP(),150,0.0);
        Assert.assertEquals(new FireMage().getAP(),100,0.0);
        Assert.assertEquals(new Priest().getAP(),50,0.0);
        Assert.assertEquals(new Goblin().getAP(),50,0.0);
        Assert.assertEquals(new IceGolem().getAP(),10,0.0);
        Assert.assertEquals(new Undead().getAP(),20,0.0);
        Assert.assertEquals(new Knight().getName(),"middleAgeBattle.Knight");
        Assert.assertEquals(new FireMage().getName(),"Fire Mage");
        Assert.assertEquals(new Priest().getName(),"middleAgeBattle.Priest");
    }

    @Test
    public void constructorTest() {
        Knight k = new Knight("k",1,2);
        FireMage f = new FireMage("f",1,2);
        Priest p = new Priest("p",1,2);
        Goblin g = new Goblin(1,2);
        IceGolem i = new IceGolem(1,2);
        Undead u = new Undead(1,2);
        Assert.assertEquals(k.getHP(),1,0.0);
        Assert.assertEquals(f.getHP(),1,0.0);
        Assert.assertEquals(p.getHP(),1,0.0);
        Assert.assertEquals(g.getHP(),1,0.0);
        Assert.assertEquals(i.getHP(),1,0.0);
        Assert.assertEquals(u.getHP(),1,0.0);
        Assert.assertEquals(k.getAP(),2,0.0);
        Assert.assertEquals(f.getAP(),2,0.0);
        Assert.assertEquals(p.getAP(),2,0.0);
        Assert.assertEquals(g.getAP(),2,0.0);
        Assert.assertEquals(i.getAP(),2,0.0);
        Assert.assertEquals(u.getAP(),2,0.0);
        Assert.assertEquals(k.getName(),"k");
        Assert.assertEquals(f.getName(),"f");
        Assert.assertEquals(p.getName(),"p");

    }

    @Test
    public void undeadTest() {
        Undead testCharacter = new Undead();
        assertFalse(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),800,0.0);
        assertFalse(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),800,0.0);
        assertTrue(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),650,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),600,0.0);
        assertTrue(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),350,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),330,0.0);
        Knight killer = new Knight("killer",1,350);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void fireMageTest() {
        FireMage testCharacter = new FireMage();
        assertTrue(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),925,0.0);
        assertTrue(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),905,0.0);
        assertTrue(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),680,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),480,0.0);
        assertFalse(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),480,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),460,0.0);
        Undead killer = new Undead(1,480);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void priestTest() {
        Priest testCharacter = new Priest();
        assertTrue(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),950,0.0);
        assertTrue(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),930,0.0);
        assertFalse(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),930,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),730,0.0);
        assertFalse(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),730,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),710,0.0);
        Undead killer = new Undead(1,710);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void knightTest() {
        Knight testCharacter = new Knight();
        assertTrue(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),975,0.0);
        assertTrue(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),955,0.0);
        assertTrue(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),805,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),605,0.0);
        assertFalse(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),605,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),590,0.0);
        Undead killer = new Undead(1,590);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void goblinTest() {
        Goblin testCharacter = new Goblin();
        assertFalse(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),500,0.0);
        assertTrue(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),480,0.0);
        assertTrue(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),292.5,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),92.5,0.0);
        assertFalse(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),92.5,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),72.5,0.0);
        Undead killer = new Undead(1,75);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void iceGolemTest() {
        IceGolem testCharacter = new IceGolem();
        assertFalse(goblin.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),2000,0.0);
        assertFalse(undead.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),2000,0.0);
        assertTrue(knight.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),1925,0.0);
        assertTrue(fireMage.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),1425,0.0);
        assertFalse(priest.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),1425,0.0);
        assertTrue(iceGolem.attack(testCharacter));
        Assert.assertEquals(testCharacter.getHP(),1415,0.0);
        IceGolem killer = new IceGolem(1,1415);
        killer.attack(testCharacter);
        Assert.assertEquals(testCharacter.getHP(),0,0.0);
        assertFalse(testCharacter.attack(killer));
    }

    @Test
    public void FruitTreeTest() {
        FruitTree testTree = new FruitTree();
        Goblin testGoblin = new Goblin(100,10);
        Knight k = new Knight("k",1,2);
        FireMage f = new FireMage("f",1,2);
        Priest p = new Priest("p",1,2);
        double goblinHeal = testGoblin.getHP()+0.15* StandardEntity.GOBLIN.getHp();
        double humanHeal = 301;

        assertTrue(goblin.attack(testTree));
        Assert.assertEquals(goblin.getHP(), StandardEntity.GOBLIN.getHp(),0.0);

        assertTrue(testGoblin.attack(testTree));
        Assert.assertEquals(testGoblin.getHP(),goblinHeal,0.0);

        assertFalse(undead.attack(testTree));
        Assert.assertEquals(undead.getHP(),800,0.0);

        assertTrue(k.attack(testTree));
        Assert.assertEquals(k.getHP(),humanHeal,0.0);

        assertTrue(f.attack(testTree));
        Assert.assertEquals(f.getHP(),humanHeal,0.0);

        assertTrue(p.attack(testTree));
        Assert.assertEquals(p.getHP(),humanHeal,0.0);

        assertFalse(iceGolem.attack(testTree));
        Assert.assertEquals(iceGolem.getHP(),2000,0.0);
    }

    @Test
    public void rockTest() {
        Rock testRock = new Rock();
        assertFalse(goblin.attack(testRock));
        assertFalse(undead.attack(testRock));
        assertTrue(knight.attack(testRock));
        Assert.assertEquals(knight.getHP(),850,0.0);
        assertTrue(fireMage.attack(testRock));
        Assert.assertEquals(fireMage.getHP(),900,0.0);
        assertTrue(priest.attack(testRock));
        Assert.assertEquals(priest.getHP(),950,0.0);
        assertFalse(iceGolem.attack(testRock));
    }
}
