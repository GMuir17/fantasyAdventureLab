package Adventure.Rooms;

import Adventure.Bosses.Boss;

import java.util.ArrayList;

public class BossRoom extends Room {

    private Boss boss;

    public BossRoom(String theme, ArrayList party, Boss boss) {
        super(theme, party);
        this.boss = boss;
    }


}
