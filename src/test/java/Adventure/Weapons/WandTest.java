package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WandTest {

    Wand wand;

    @Before
    public void setUp() {
        this.wand = new Wand();
    }

    @Test
    public void hasDamage() {
        assertEquals(3, wand.getDamage());
    }


}
