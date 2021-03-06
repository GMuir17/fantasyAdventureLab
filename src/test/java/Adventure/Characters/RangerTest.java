package Adventure.Characters;

import Adventure.Armour.Leather;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Weapons.Bow;
import Adventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangerTest {

    Ranger ranger;
    Bow bow;
    Leather leather;
    Necromancer necromancer;

    @Before
    public void setUp() {
        necromancer = new Necromancer(100, 40);
        bow = new Bow();
        leather = new Leather();
        ranger = new Ranger("Aragorn", bow, leather);
    }

    @Test
    public void hasName() {
        assertEquals("Aragorn", ranger.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, ranger.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(bow, ranger.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(leather, ranger.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        ranger.decreaseHP(10);
        assertEquals(90, ranger.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        ranger.decreaseHP(20);
        ranger.increaseHP(30);
        assertEquals(100, ranger.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Sword sword = new Sword();
        ranger.changeWeapon(sword);
        assertEquals(sword, ranger.getWeapon());
    }

    @Test
    public void canDoDamage() {
        IWeapon bow = ranger.getWeapon();
        bow.doDamage(necromancer);
        assertEquals(90, necromancer.getHP());
    }


}
