package dragon.cave;

import dragon.cave.treasures.Treasure;
import gift.UserInteraction;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        TreasuresInCave treasuresInCave = new TreasuresInCave();
        while (true) {
            int choice = ui.requestInt("""
                    pick your action
                    1.all treasures
                    2.the most expensive treasure
                    3.treasures on your coins
                    your choice:\s""");
            switch (choice) {
                case (1) -> treasuresInCave.treasureList.forEach(System.out::println);
                case (2) -> System.out.println(TreasuresOnSomeSum.highestPrice(treasuresInCave.treasureList));
                case (3) -> {
                    int sum = ui.requestInt("How much coins do you have: ");
                    List<Treasure> list = new ArrayList<>(TreasuresOnSomeSum.countMinCoinsUtil(sum, treasuresInCave.treasureList));
                    System.out.println(list.toString());
                }
            }
            if (ui.requestContinue("Do you want continue?Y/N: ")) break;
        }
    }
}