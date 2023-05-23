package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.damage);
        }

        @Override
        public void takeHit(int damage) {
            this.health -= damage;
            monstersHealth -= damage;
        }
    };

    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            this.health -= (damage + 5);
            monstersHealth -= (damage + 5);
        }
    };

    public static int monstersHealth = 110;
}
