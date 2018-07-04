package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;

public class Mace implements IWeapon {

    private int damage;

    public Mace(){
        this.damage = 8;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(Boss boss){
        boss.decreaseHP(this.damage);
    }
}
