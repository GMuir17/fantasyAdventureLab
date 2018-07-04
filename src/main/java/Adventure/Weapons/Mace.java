package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class Mace implements IWeapon {

    private int damage;

    public Mace(){
        this.damage = 8;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }
}
