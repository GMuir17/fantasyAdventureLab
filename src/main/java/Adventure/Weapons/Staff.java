package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class Staff implements IWeapon {

    private int damage;

    public Staff(){
        this.damage = 4;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }
}
