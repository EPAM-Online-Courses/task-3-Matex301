package efs.task.oop;

public abstract class Monster implements Fighter {
    int health;
    int damage;


    public Monster(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
