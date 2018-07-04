package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class THAxeTest {

    THAxe tHAxe;

    @Before
    public void setUp() {
        this.tHAxe = new THAxe();
    }

    @Test
    public void hasDamage() {
        assertEquals(20, tHAxe.getDamage());
    }


}
