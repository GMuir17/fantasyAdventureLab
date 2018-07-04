package Adventure.Armour;

import Adventure.Behaviours.IArmour;

public class Cloth implements IArmour {

    private int armourRating;

    public Cloth(){
        this.armourRating = 1;
    }

    public int getArmourRating(){
        return this.armourRating;
    }

    public void blockDamage(){

    }
}
