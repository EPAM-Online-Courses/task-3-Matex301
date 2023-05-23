package efs.task.oop;


public class ExtraordinaryVillager extends Villager{
    Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
        this.health = 0;
    }

    @Override
    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old. " + this.skill.getSkill());
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    @Override
    public void takeHit(int damage) {
        this.health = 0;
    }

    public enum Skill {

        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String skill;

        Skill(String skill) {
            this.skill = skill;
        }

        public String getSkill() {
            return this.skill;
        }
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }
}
