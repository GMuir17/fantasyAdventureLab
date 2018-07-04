package Adventure.Characters;

import Adventure.Armour.Leather;
import Adventure.Behaviours.IArmour;
import Adventure.Behaviours.IWeapon;
import Adventure.Bosses.Boss;
import Adventure.Weapons.Bow;

public abstract class PlayerCharacter {

    private int hp;
    private String name;
    private IWeapon weapon;
    private IArmour armour;

    public PlayerCharacter(String name, IWeapon weapon, IArmour armour){
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

    public int getArmourValue() {
        IArmour armour = this.getArmour();
        return armour.getArmourRating();
    }

    public void decreaseHP(int hpLoss) {
        this.hp -= hpLoss;
    }

    public void setHP(int newHP){
        this.hp = newHP;
    }

    public void increaseHP(int hpGain) {
        int maxHP = 100;
        if(this.hp < maxHP){
           if (compareHP(hpGain) == true) {
               setHP(maxHP);
            }
            else {
               this.hp += hpGain;
           }
        }
    }

    public boolean compareHP(int hpGain){
        if (this.hp + hpGain >= 100) {
            return true;
            }
            else {
            return false;
        }
    }

    public void changeWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }

    public void meleeAttack(Boss boss) {
        this.weapon.doDamage(boss);
    }






















}
