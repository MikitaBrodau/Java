package dragon.cave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreasuresInCave treasuresInCave = new TreasuresInCave();
        int choice = 0;
        int onSomeSum = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Good day\nYou in Dragon cave");
            System.out.println("you have next 3 choices\n1.Show all treasuresInCave.\t" +
                    "2.Show most expensive one.\t3.Pick treasuresInCave on your sum.");
            System.out.println("Please enter 1/2/3");
            choice = sysIn(1);
            if (choice == 3){
                System.out.println("Okay, now u should say how big is ur wallet. But don't let me take more then 10k");
                onSomeSum = sysIn(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (choice) {
            case 1 -> treasuresInCave.treasureList.forEach(Treasure -> System.out.println(Treasure.toString()));
            case 2 -> System.out.println(Treasure.highestPrice(treasuresInCave.treasureList));
            case 3 -> ConditionalMethods.countMinCoinsUtil(onSomeSum, treasuresInCave.treasureList).forEach(Treasure -> System.out.println(Treasure.toString()));
        }
    }

    private static int sysIn(int choice) {

        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1 -> {
                if (sc.hasNextInt()) {
                    int c = sc.nextInt();
                    if(c < 4 && c > 0) return c;
                }
            }
            case 2 -> {
                while (sc.hasNextInt()) {
                    int c = sc.nextInt();
                    if(c > 10000) return 9999;
                } return 0;
            }

        }
        throw new IllegalArgumentException("smth wrong");
    }
}
