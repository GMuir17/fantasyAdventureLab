package Adventure.Rooms;

import Adventure.Characters.PlayerCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    ArrayList<PlayerCharacter> party;

    @Before
    public void setup(){
        treasureRoom = new TreasureRoom("Gold", party);
    }

    @Test
    public void canGetEmptyParty(){
        assertEquals(0, treasureRoom.partyCount());
    }
}
