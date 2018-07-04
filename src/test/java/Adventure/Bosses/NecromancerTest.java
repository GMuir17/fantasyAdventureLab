package Adventure.Bosses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NecromancerTest {

        Necromancer necromancer;

        @Before
        public void setUp() {
            this.necromancer = new Necromancer(100, 40);
        }

        @Test
        public void hasHP() {
            assertEquals(100, necromancer.getHP());
        }

        @Test
        public void hasDamage() {
            assertEquals(40, necromancer.getDamage());
        }

    @Test
    public void decreaseHP(){
        necromancer.decreaseHP(10);
        assertEquals(90, necromancer.getHP());
    }
}
