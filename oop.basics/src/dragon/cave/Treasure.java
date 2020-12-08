package dragon.cave;

import java.util.List;

public abstract class Treasure {
    private final int price;
    private final String name;
    private int dmg;
    private String description;

    public Treasure(int price, String name, int dmg, String description) {
        this.price = price;
        this.name = name;
        this.dmg = dmg;
        this.description = description;
    }

    public Treasure(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getDmg() {
        return dmg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "price:" + price +
                "\tname: " + name +
                "\tdmg: " + dmg;
    }

    public abstract void showDescription();
    public static Treasure highestPrice(List<Treasure> list){
        Treasure max = list.get(0);
        for (Treasure t :
                list) {
            if (t.price > max.price) max = t;
        }
        return max;
    }

}
