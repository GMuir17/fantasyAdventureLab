package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaceTest {

    Mace mace;

    @Before
    public void setUp() {
        this.mace = new Mace();
    }

    @Test
    public void hasDamage() {
        assertEquals(8, mace.getDamage());
    }


}
