package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;

public class Bow implements IWeapon {

    private int damage;

    public Bow(){
        this.damage = 10;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(Boss boss){
        boss.decreaseHP(this.damage);
    }
}
