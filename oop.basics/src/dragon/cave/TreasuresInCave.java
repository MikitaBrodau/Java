package dragon.cave;

import dragon.cave.treasures.*;

import java.util.ArrayList;
import java.util.List;

import static dragon.cave.NameGeneration.getRandomName;

public class TreasuresInCave {
    public List<Treasure> treasureList = new ArrayList<>();

    public TreasuresInCave() {
        createArmor();
        createGold();
        createAxes();
        createSwords();
    }

    private void createSwords(){
        for (int i = 0; i < 32; i++) {
            treasureList.add(new Sword(randPrice(), getRandomName(), randDmg(), getRandomName(),
                    (int) Math.floor(1 + Math.random() * 2)));
        }
    }

    private void createAxes(){
        for (int i = 0; i < 32; i++) {
            treasureList.add(new Axe(randPrice(), getRandomName(), randDmg(), getRandomName(),
                    (int) Math.floor(1 + Math.random() * 3)));
        }
    }

    private void createArmor(){
        for (int i = 0; i < 32; i++) {
            treasureList.add(new Armor(randPrice(), getRandomName(), getRandomName(), randDef(), (int) Math.floor(1 + Math.random() * 4)));
        }
    }

    private void createGold(){
        for (int i = 0; i < 4; i++) {
            treasureList.add(new Gold(1, "Gold", (int) (Math.random()*1000)));
        }
    }

    private int randPrice() {
        return (int) (1 + Math.floor(Math.random() * 997));
    }

    private int randDmg() {
        return (int) (1 + Math.floor(Math.random() * 150));
    }

    private int randDef() {
        return (int) (1 + Math.floor(Math.random() * 100));
    }
}
