package dragon.cave.treasures;

public class Sword extends Treasure {
    private final SwordType swordType;

    public Sword(int price, String name, int dmg, String description, int swordType) {
        super(price, name, dmg, description);
        this.swordType = SwordType.valueOf(swordType);
    }

    @Override
    public void showDescription() {
        System.out.println(swordType.toString() + "\n" + getDescription());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + swordType;
    }
}

enum SwordType {
    LONGSWORD(1, "Long sword"), DOUBLE_EDGED(2, "Double-edged"), KATANA(3, "Katana");
    int type;
    String txt;

    SwordType(int type, String txt) {
        this.type = type;
        this.txt = txt;
    }

    public static SwordType valueOf(int type) {
        for (SwordType c : SwordType.values()) {
            if (c.type == type) return c;
        }
        throw new ArrayIndexOutOfBoundsException("Sorry, wrong number");
    }

    @Override
    public String toString() {
        return "Sword type: " + txt;
    }
}
