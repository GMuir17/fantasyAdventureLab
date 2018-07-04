package Adventure.Rooms;

import Adventure.Bosses.Boss;
import Adventure.Characters.PlayerCharacter;

import java.util.ArrayList;

public abstract class Room {

    private String theme;
    private ArrayList<PlayerCharacter> party;

    public Room(String theme, ArrayList party) {
        this.theme = theme;
        this.party = new ArrayList<>();
    }

    public String hasTheme() {
        return this.theme;
    }

    public ArrayList hasParty() {
        return this.party;
    }


    public int partyCount() {
        return party.size();
    }
}
