package Adventure.Weapons;

import Adventure.Behaviours.IWeapon;

public class THAxe implements IWeapon {

    private int damage;

    public THAxe(){
        this.damage = 20;
    }

    public int getDamage() {
        return this.damage;
    }

    public void doDamage(){

    }


}
