package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;

public class Staff implements IWeapon {

    private int damage;

    public Staff(){
        this.damage = 4;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(Boss boss){
        int bossHP = boss.getHP();
        bossHP -= this.damage;
    }
}
