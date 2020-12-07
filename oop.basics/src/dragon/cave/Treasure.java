package dragon.cave;

public abstract class Treasure {
    private int price;
    private String name;
    private int dmg;
    private String description;

    public Treasure(int price, String name, int dmg, String description) {
        this.price = price;
        this.name = name;
        this.dmg = dmg;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
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
                "\tdmg: " + dmg +
                "\tdescription: " + description;
    }

    public abstract void showDescription();
}

