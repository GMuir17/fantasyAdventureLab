package Adventure.Characters;

import Adventure.Armour.Cloth;
import Adventure.Armour.Leather;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Weapons.Bow;
import Adventure.Weapons.Sword;
import Adventure.Weapons.Wand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorcererTest {

    Sorcerer sorcerer;
    Wand wand;
    Cloth cloth;
    Necromancer necromancer;

    @Before
    public void setUp() {
        necromancer = new Necromancer(100, 40);
        wand = new Wand();
        cloth = new Cloth();
        sorcerer = new Sorcerer("Saruman", wand, cloth);
    }

    @Test
    public void hasName() {
        assertEquals("Saruman", sorcerer.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, sorcerer.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(wand, sorcerer.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(cloth, sorcerer.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        sorcerer.decreaseHP(10);
        assertEquals(90, sorcerer.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        sorcerer.decreaseHP(20);
        sorcerer.increaseHP(30);
        assertEquals(100, sorcerer.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Sword sword = new Sword();
        sorcerer.changeWeapon(sword);
        assertEquals(sword, sorcerer.getWeapon());
    }

    @Test
    public void canDoDamage() {
        IWeapon wand = sorcerer.getWeapon();
        wand.doDamage(necromancer);
        assertEquals(97, necromancer.getHP());
    }



}
