package Adventure.Armour;

import Adventure.Behaviours.IArmour;

public class Plate implements IArmour {

    private int armourRating;

    public Plate(){
        this.armourRating = 20;
    }

    public int getArmourRating(){
        return this.armourRating;
    }

    public void blockDamage(){

    }
}
