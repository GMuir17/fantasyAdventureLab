package Adventure.Bosses;

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
}
