package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class Wand implements IWeapon {

    private int damage;

    public Wand(){
        this.damage = 3;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }
}
