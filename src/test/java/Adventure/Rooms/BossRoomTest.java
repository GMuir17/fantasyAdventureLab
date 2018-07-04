package Adventure.Rooms;

import Adventure.Armour.Plate;
import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Necromancer;
import Adventure.Characters.Barbarian;
import Adventure.Characters.Paladin;
import Adventure.Characters.PlayerCharacter;
import Adventure.Weapons.Sword;
import Adventure.Weapons.THAxe;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BossRoomTest {

    BossRoom bossRoom;
    IWeapon tHAxe;
    IWeapon sword;
    IArmour plate;
    Paladin paladin;
    ArrayList<PlayerCharacter> party;
    Necromancer necromancer;

    @Before
    public void setUp() {
        this.tHAxe = new THAxe();
        this.sword = new Sword();
        this.plate = new Plate();
        this.paladin = new Paladin("Otto", sword, plate);
        this.party = new ArrayList<>();
        this.necromancer = new Necromancer(100, 40);


        party.add(paladin);
        this.bossRoom = new BossRoom("Frozen", party, necromancer);
    }

    @Test
    public void characterCanAttackBossWithinRoom() {
        paladin.meleeAttack(necromancer);
        assertEquals(88, necromancer.getHP());
    }

    @Test
    public void bossCanAttackCharacter() {
        necromancer.attack(paladin);
        assertEquals(80, paladin.getHP());
    }



    @Test
    public void progressToTreasureRoom(){
        paladin.changeWeapon(tHAxe);
        paladin.meleeAttack(necromancer);
        paladin.meleeAttack(necromancer);
        paladin.meleeAttack(necromancer);
        paladin.meleeAttack(necromancer);
        paladin.meleeAttack(necromancer);

        assertEquals(true, necromancer.isDead());
    }


}
