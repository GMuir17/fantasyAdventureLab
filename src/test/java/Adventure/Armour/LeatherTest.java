package Adventure.Armour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeatherTest {
    Leather leather;

    @Before
    public void setup(){
        leather = new Leather();
    }

    @Test
    public void hasArmourRating(){
        assertEquals(5, leather.getArmourRating());
    }
}
