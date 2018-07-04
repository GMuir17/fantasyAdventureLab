package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void setUp() {
        this.sword = new Sword();
    }

    @Test
    public void hasDamage() {
        assertEquals(12, sword.getDamage());
    }


}
