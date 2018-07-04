package Adventure.Characters;

import Adventure.Armour.ChainMail;
import Adventure.Weapons.THAxe;
import Adventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    THAxe tHAxe;
    ChainMail chainMail;

    @Before
    public void setUp() {
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


}
