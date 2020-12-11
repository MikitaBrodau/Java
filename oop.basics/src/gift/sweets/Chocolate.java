package gift.sweets;

import java.util.StringJoiner;

public class Chocolate extends Pastry {
    private final ChocolateType chocolateType;

    public Chocolate(int chocolateTypeId) {
        this.chocolateType = ChocolateType.valueOf(chocolateTypeId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Chocolate.class.getSimpleName() + "[", "]")
                .add("id: " + chocolateType.getId()).add("type: " + chocolateType.getTxt()).toString();
    }

    public static void getTypes() {
        for (ChocolateType c : ChocolateType.values()) {
            System.out.println(c.toString());
        }
    }
}

enum ChocolateType {
    DARK(1, "Dark"), MILK(2, "Milk"), WHITE(3, "White"), RUBY(4, "Ruby"),
    DIABETIC(5, "Diabetic"), VEGETARIAN(6, "Vegan");
    private final int id;
    private final String txt;

    public int getId() {
        return id;
    }

    public String getTxt() {
        return txt;
    }

    ChocolateType(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public static ChocolateType valueOf(int id) {
        for (ChocolateType c : ChocolateType.values()) {
            if (id == c.id) return c;
        }
        throw new IllegalArgumentException("Wrong value: " + id);
    }
}