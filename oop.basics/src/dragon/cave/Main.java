package dragon.cave;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Treasure> t = new ArrayList<>();
        t.add(new Sword(400, "Dragon Born sword", 300, "Ready for Dragon heart", 1) {
            public int thunder() {
                return this.getDmg() * 3;
            }

            public int bloodSpread(int health) {
                return (health / 100) * getDmg();
            }
        });
        t.add(new Gold(1, "A few coins of gold", "Find that on island", 2));
        t.add(new Sword(20, "Rusty sword", 2, "", 3));
        t.add(new Axe(2, "Mini axe", 1, "Yep, that is useless", 4));
        t.add(new Treasure(13, "Fork", "A fork??? yep, and she is rly expensive... for Fork i mean") {
            @Override
            public void showDescription() {
                System.out.println(getDescription());
            }
        });
        t.add(new Armor(130, "Helm of truth","Now you will see, r anyone lie to you", 60, 1));
        t.add(new Armor(40, "Rusty Cuirass", "Some man get burned in that armor...", 12, 2));
        t.add(new Armor(50, "Gloves of fate", "Probably that's from some anime", 33, 4));
        t.add(new Armor(55, "Girl leggings", "She probably really don't want to be here", 9, 3));
        t.add(new Armor(200, "Boots of wisdom", "Some mage throwed fireball, and get some too >:)", 10, 5));
        t.add(new Sword(30, "Katana", 17, """
                               Japan warrior follow the road
                               Sakura dropped out from trees
                               The rocks behind make some noise
                               samurai get eaten by beast""", 3));
        t.add(new Axe(70, "Any Axe", 30, "", 2));
        t.add(new Axe(999, "Jesus axe", 0, "That jesus axe, don't deal damage, but may  hurt your faith feelings", 1));
        t.add(new Axe(100, "", 50, "Find that on island", 4));
        t.add(new Axe(0, "Imagination axe", 1, "Just imagine how strong it could be, if he is not in your mind", 4));
        t.add(new Axe(3, "Lovely axe", 8, "Some LGBT axe", 4));
        t.add(new Axe(230, "Infernal", 80, "From Satan, with love.", 4));
        t.add(new Sword(0, "Tree branch sword", 3, "that tree is free!", 3));
        t.add(new Gold(1, "Heap of gold", "Not for everyone", 600));
        t.add(new Gold(10, "Shiny gold", "Crap, it's cursed", 10));
        t.add(new Sword(170, "Mad sword", 140, "cursed too", 2));
        t.add(new Sword(10, "Tooth pick", 18, "Find that in my teeth", 1));
        t.add(new Sword(500, "Golden sword", 10, "He just for ur show off ", 1));
        t.add(new Armor(1, "Helmet with dragon scale", "Actually that just dropped from dragon mouth", 30,1));
        t.add(new Axe(75, "Axe of Axe(name)", 26, "Last owner name is pretty dumb", 3));
        t.add(new Axe(40, "Spider axe", 71, "just nvm", 1));
        t.add(new Axe(20, "Not at all Viking Axe", 9, "what is that???", 2));
        t.add(new Axe(100, "Viking axe", 50, "Find that on island", 2));
        System.out.println(t.size());
        for (Treasure tr : t) {
            System.out.println(tr.toString());
        }
        System.out.println(Treasure.highestPrice(t).toString() + "\n" + Treasure.highestPrice(t).getDescription());
    }
}