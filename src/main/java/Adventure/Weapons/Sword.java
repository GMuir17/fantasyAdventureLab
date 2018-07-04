package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damage;

    public Sword(){
        this.damage = 12;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }
}
