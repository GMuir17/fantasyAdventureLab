package Adventure.Armour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClothTest {

     Cloth cloth;

    @Before
    public void setup(){
         cloth= new Cloth ();
    }

    @Test
    public void hasArmourRating(){
        assertEquals(1, cloth.getArmourRating());
    }
}
