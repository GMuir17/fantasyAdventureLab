package Adventure.Characters;

import Adventure.Armour.ChainMail;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Weapons.THAxe;
import Adventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    THAxe tHAxe;
    ChainMail chainMail;
    Necromancer necromancer;

    @Before
    public void setUp() {
        necromancer = new Necromancer(100, 40);
        tHAxe = new THAxe();
        chainMail   = new ChainMail();
        barbarian = new Barbarian("Conan", tHAxe, chainMail);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, barbarian.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(tHAxe, barbarian.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(chainMail , barbarian.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        barbarian.decreaseHP(10);
        assertEquals(90, barbarian.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        barbarian.decreaseHP(20);
        barbarian.increaseHP(30);
        assertEquals(100, barbarian.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Sword sword = new Sword();
        barbarian.changeWeapon(sword);
        assertEquals(sword, barbarian.getWeapon());
    }
    @Test
    public void canDoDamage() {
        IWeapon THaxe = barbarian.getWeapon();
        THaxe.doDamage(necromancer);
        assertEquals(80, necromancer.getHP());
    }


}
