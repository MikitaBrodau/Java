package dragon.cave;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Treasure> treasures = new ArrayList<>();
        treasures.add(new Sword(400, "Dragon Born sword", 300, "Ready for Dragon heart", 1) {
            public int thunder() {
                return this.getDmg() * 3;
            }

            public int bloodSpread(int health) {
                return (health / 100) * getDmg();
            }
        });
        System.out.println(treasures.toString());
    }
}