package Adventure.Bosses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollChiefTest {

        TrollChief trollChief;

        @Before
        public void setUp() {
            this.trollChief = new TrollChief(100, 40);
        }

        @Test
        public void hasHP() {
            assertEquals(100, trollChief.getHP());
        }

        @Test
        public void hasDamage() {
            assertEquals(40, trollChief.getDamage());
        }
}
