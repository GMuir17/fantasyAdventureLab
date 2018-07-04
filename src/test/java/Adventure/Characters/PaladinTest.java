package Adventure.Characters;

import Adventure.Armour.Plate;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Weapons.Bow;
import Adventure.Weapons.Sword;
import Adventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaladinTest {

    Paladin paladin;
    Sword sword;
    Plate plate;
    Necromancer necromancer;

    @Before
    public void setUp() {
        sword = new Sword();
        plate   = new Plate();
        paladin = new Paladin("Otto", sword, plate);
        necromancer = new Necromancer(100, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Otto", paladin.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, paladin.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, paladin.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(plate , paladin.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        paladin.decreaseHP(10);
        assertEquals(90, paladin.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        paladin.decreaseHP(20);
        paladin.increaseHP(30);
        assertEquals(100, paladin.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Bow bow = new Bow();
        paladin.changeWeapon(bow);
        assertEquals(bow, paladin.getWeapon());
    }

    @Test
    public void canDoDamage() {
        IWeapon sword = paladin.getWeapon();
        sword.doDamage(necromancer);
        assertEquals(88, necromancer.getHP());
    }


}
