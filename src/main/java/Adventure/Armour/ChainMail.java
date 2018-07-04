package Adventure.Armour;

import Adventure.Behaviours.IArmour;

public class ChainMail implements IArmour {
    private int armourRating;

    public ChainMail(){
        this.armourRating = 10;
    }

    public int getArmourRating(){
        return this.armourRating;
    }

    public void blockDamage(){

    }
}
