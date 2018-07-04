package Adventure.Characters;

import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;

public abstract class Character {

    private int hp;
    private String name;
    private IWeapon weapon;
    private IArmour armour;

    public Character(int hp, String name, IWeapon weapon, IArmour armour){
        this.hp = hp;
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
    }

}
