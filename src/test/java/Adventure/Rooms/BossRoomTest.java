package Adventure.Rooms;

import Adventure.Armour.Plate;
import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;
import Adventure.Characters.Paladin;
import Adventure.Weapons.Sword;
import org.junit.Before;

import java.util.ArrayList;

public class BossRoomTest {

    BossRoom bossRoom;
    IWeapon sword;
    IArmour plate;
    Paladin paladin;
    ArrayList<Character> party;

    @Before
    public void setUp() {
        this.sword = new Sword();
        this.plate = new Plate();
        this.paladin = new Paladin("Otto", sword, plate);
        this.party = new ArrayList<>();
        party.add(paladin);
        this.bossRoom = new BossRoom("Frozen", )
    }
}
