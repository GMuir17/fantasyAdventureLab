package Adventure.Bosses;

import Adventure.Behaviours.IArmour;
import Adventure.Characters.PlayerCharacter;

public abstract class Boss {

    private int hp;
    private int damage;

    public Boss(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHP() {
        return this.hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public void decreaseHP(int hpLoss) {
        this.hp -= hpLoss;
    }

    public void attack(PlayerCharacter character) {
        int armourValue = character.getArmourValue();
        int armourPiercing = (this.damage - armourValue);
        character.decreaseHP(armourPiercing);
    }

    public boolean isDead() {
        if (this.hp <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
