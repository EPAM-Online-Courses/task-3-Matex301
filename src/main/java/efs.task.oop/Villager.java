package efs.task.oop;

public class Villager implements Fighter{
    String name;
    int age;

    int health;


    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void attack(Fighter victim) {
        double damage = (100 - this.getAge() * 0.5) / 10.;
        victim.takeHit((int) damage);
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}