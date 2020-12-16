package dragon.cave.treasures;

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

    public Treasure(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return "price:" + price +
                "\tname: " + name +
                "\tdmg: " + dmg;
    }

}
