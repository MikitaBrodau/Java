package dragon.cave.treasures;

public class Armor extends Treasure {
    private final int defence;
    private final ArmorType armorType;

    public Armor(int price, String name, String description, int defence, int armorType) {
        super(price, name, description);
        this.defence = defence;
        this.armorType = ArmorType.valueOf(armorType);
    }

    @Override
    public void showDescription() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + armorType + "\tDefence: " + defence;
    }
}

enum ArmorType {
    HELMET(1, "Helmet"), CUIRASS(2, "Cuirass"), LEGGINGS(3, "leggings"), GLOVES(4, "Gloves"), BOOTS(5, "Boots");
    int type;
    String txt;

    ArmorType(int type, String txt) {
        this.type = type;
        this.txt = txt;
    }

    public static ArmorType valueOf(int type) {
        for (ArmorType c : ArmorType.values()) {
            if (c.type == type) return c;
        }
        throw new ArrayIndexOutOfBoundsException("Sorry, wrong number");
    }

    @Override
    public String toString() {
        return "Armor type: " + txt;
    }
}