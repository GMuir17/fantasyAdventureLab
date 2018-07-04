package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class Bow implements IWeapon {

    private int damage;

    public Bow(){
        this.damage = 10;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }
}
