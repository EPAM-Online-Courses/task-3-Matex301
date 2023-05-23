package efs.task.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara  = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        Villager villagerDeckardCain = deckardCain;
        Villager villagerAkara = akara;

        //villagerDeckardCain.getSkill(); //Nie można

        ArrayList<Villager> villagers = new ArrayList<>(Arrays.asList(kashya, gheed, villagerAkara, villagerDeckardCain, warriv, flawia));
        ArrayList<Monster> monsters = new ArrayList<>(Arrays.asList(Monsters.andariel, Monsters.blacksmith));

        boolean flip = true;
        while (Monsters.monstersHealth > 0){
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
            System.out.println("Aktualnie walczacy osadnik to " + villagers.get(0).getName());

            if(flip) {
                //Villager
                villagers.get(0).attack(monsters.get(0));
                if(monsters.get(0).getHealth() <= 0)
                    monsters.remove(0);

                if(monsters.size() == 0)
                    break;

                //Monster
                monsters.get(0).attack(villagers.get(0));
                if(villagers.get(0).getHealth() <= 0)
                    villagers.remove(0);
            } else {
                //Monster
                monsters.get(0).attack(villagers.get(0));
                if(villagers.get(0).getHealth() <= 0)
                    villagers.remove(0);

                if(monsters.size() == 0)
                    break;

                //Villager
                villagers.get(0).attack(monsters.get(0));
                if(monsters.get(0).getHealth() <= 0)
                    monsters.remove(0);
            }

            flip = !flip;
        }
        System.out.println("Obozowisko ocalone!");
        deckardCain = (ExtraordinaryVillager) villagerDeckardCain;
        akara = (ExtraordinaryVillager) villagerAkara;
    }
}
