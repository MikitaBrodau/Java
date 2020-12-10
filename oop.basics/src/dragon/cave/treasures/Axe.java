package dragon.cave.treasures;

public class Axe extends Treasure {
    private final AxeType axeType;

    public Axe(int price, String name, int dmg, String description, int axeType) {
        super(price, name, dmg, description);
        this.axeType = AxeType.valueOf(axeType);
    }

    @Override
    public void showDescription() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + axeType;
    }
}

enum AxeType {
    BARDICHE(1, "Bardiche"), DOUBLE_SIDE(2, "Viking double-side"), TOMAHAWK(3, "Tomahawk"), BATTLE_AXE(4, "Viking battle axe");
    int type;
    String txt;

    AxeType(int type, String txt) {
        this.type = type;
        this.txt = txt;
    }

    public static AxeType valueOf(int type) {
        for (AxeType c : AxeType.values()) {
            if (c.type == type) return c;
        }
        throw new ArrayIndexOutOfBoundsException("Sorry, wrong number");
    }

    @Override
    public String toString() {
        return "Axe type: " + txt;
    }
}