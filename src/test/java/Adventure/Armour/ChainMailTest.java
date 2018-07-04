package Adventure.Armour;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainMailTest {

    ChainMail chainmail;

    @Before
    public void setup(){
        chainmail = new ChainMail();
    }

    @Test
    public void hasArmourRating(){
        assertEquals(10, chainmail.getArmourRating());
    }


}
