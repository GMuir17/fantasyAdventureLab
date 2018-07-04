package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void setUp() {
        this.bow = new Bow();
    }

    @Test
    public void hasDamage() {
        assertEquals(10, bow.getDamage());
    }



}
