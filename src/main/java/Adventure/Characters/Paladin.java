package Adventure.Characters;

import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;

public class Paladin extends Character{

    public Paladin(String name, IWeapon weapon, IArmour armour) {
        super(name, weapon, armour);
    }

    public void attack() {
        IWeapon weapon = this.getWeapon();
        weapon.doDamage();
    }


}
