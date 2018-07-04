package Adventure.Bosses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LitchKingTest {

    LitchKing litchKing;

    @Before
    public void setUp() {
        this.litchKing = new LitchKing(100, 40);
    }

    @Test
    public void hasHP() {
        assertEquals(100, litchKing.getHP());
    }

    @Test
    public void hasDamage() {
        assertEquals(40, litchKing.getDamage());
    }
}
