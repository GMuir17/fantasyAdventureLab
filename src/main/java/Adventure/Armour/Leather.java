package Adventure.Armour;

import Adventure.Behaviours.IArmour;

public class Leather implements IArmour {

    private int armourRating;

    public Leather(){
        this.armourRating = 5;
    }

    public int getArmourRating(){
        return this.armourRating;
    }

    public void blockDamage(){

    }
}
