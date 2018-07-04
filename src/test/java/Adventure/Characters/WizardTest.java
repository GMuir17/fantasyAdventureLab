package Adventure.Characters;

import Adventure.Armour.Cloth;
import Adventure.Weapons.Staff;
import Adventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Staff staff;
    Cloth cloth;

    @Before
    public void setUp() {
        staff = new Staff();
        cloth = new Cloth();
        wizard = new Wizard("Gandalf", staff, cloth);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(staff, wizard.getWeapon());
    }

    @Test
    public void hasArmour() {
        assertEquals(cloth, wizard.getArmour());
    }

    @Test
    public void canDecreaseHP() {
        wizard.decreaseHP(10);
        assertEquals(90, wizard.getHP());
    }

    @Test
    public void canIncreaseHPIfLow() {
        wizard.decreaseHP(20);
        wizard.increaseHP(30);
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void canChangeWeapon() {
        Sword sword = new Sword();
        wizard.changeWeapon(sword);
        assertEquals(sword, wizard.getWeapon());
    }

//    @Test
//    public void wandHasDamage() {
//        assertEquals(3, wizard.getWeapon().);
//    }

}
