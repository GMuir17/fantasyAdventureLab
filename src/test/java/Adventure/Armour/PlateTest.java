package Adventure.Armour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateTest {
    Plate plate;

    @Before
    public void setup(){
         plate= new Plate();
    }

    @Test
    public void hasArmourRating(){
        assertEquals(20, plate.getArmourRating());
    }
}
