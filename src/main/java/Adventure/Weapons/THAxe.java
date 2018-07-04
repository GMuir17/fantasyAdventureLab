package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;

public class THAxe implements IWeapon {

    private int damage;

    public THAxe(){
        this.damage = 20;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(Boss boss){
        int bossHP = boss.getHP();
        bossHP -= this.damage;
    }


}
