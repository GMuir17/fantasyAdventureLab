package Adventure.Weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Staff staff;

    @Before
    public void setUp() {
        this.staff = new Staff();
    }

    @Test
    public void hasDamage() {
        assertEquals(4, staff.getDamage());
    }


}
