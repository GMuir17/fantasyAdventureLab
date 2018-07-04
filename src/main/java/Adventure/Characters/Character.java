package Adventure.Characters;

import Adventure.Armour.Leather;
import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;
import Adventure.Weapons.Bow;

public abstract class Character {

    private int hp;
    private String name;
    private IWeapon weapon;
    private IArmour armour;

    public Character(String name, IWeapon weapon, IArmour armour){
        this.hp = 100;
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }

    public IArmour getArmour() {
        return this.armour;
    }
}
