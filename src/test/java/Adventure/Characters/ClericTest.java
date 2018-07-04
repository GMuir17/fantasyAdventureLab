package Adventure.Characters;

import Adventure.Armour.Leather;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Weapons.Bow;
import Adventure.Weapons.Mace;
import Adventure.Weapons.Mace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Mace mace;
    Leather leather;
    Necromancer necromancer;

    @Before
    public void setUp() {
        necromancer = new Necromancer(100, 40);
        mace = new Mace();
        leather   = new Leather();
        cleric = new Cleric("Francis", mace, leather);
    }

    @Test
    public void hasName() {
        assertEquals("Francis", cleric.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, cleric.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(mace, cleric.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(leather , cleric.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        cleric.decreaseHP(10);
        assertEquals(90, cleric.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        cleric.decreaseHP(20);
        cleric.increaseHP(30);
        assertEquals(100, cleric.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Bow bow = new Bow();
        cleric.changeWeapon(mace);
        assertEquals(mace, cleric.getWeapon());
    }

    @Test
    public void canDoDamage() {
        IWeapon mace = cleric.getWeapon();
        mace.doDamage(necromancer);
        assertEquals(92, necromancer.getHP());
    }

    @Test
    public void canMeleeAttack() {
        cleric.meleeAttack(necromancer);
        assertEquals(92, necromancer.getHP());
    }

}
