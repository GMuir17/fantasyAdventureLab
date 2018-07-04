package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;

public class Sword implements IWeapon {

    private int damage;

    public Sword(){
        this.damage = 12;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(Boss boss){
        boss.decreaseHP(this.damage);
    }
}
