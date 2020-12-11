package gift.box;

import java.util.StringJoiner;

public class Box {
    private final BoxType boxType;
    private final String color;
    private final String material;

    public Box(int boxType, String color, String material) {
        this.boxType = BoxType.valueOf(boxType);
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return new StringJoiner("", Box.class.getSimpleName() + ":", ".")
                .add("\tType: " + boxType.getTxt()).add("\tColor: " + color).add("\tMaterial: " + material).toString();
    }

    public static void getTypes() {
        for (BoxType b : BoxType.values()) {
            System.out.println(b.toString());
        }
    }
}

enum BoxType {
    HEART(1, "Heart"), ROUND(2, "Round"), FOLDING(3, "Folding"), WITH_WINDOW(4, "With Window"),
    CHEST(5, "Chest"), Simple(6, "Simple cartoon box");
    private final int id;
    private final String txt;

    public int getId() {
        return id;
    }

    public String getTxt() {
        return txt;
    }

    BoxType(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public static BoxType valueOf(int id) {
        for (BoxType b : BoxType.values()) {
            if (id == b.id) return b;
        }
        throw new IllegalArgumentException("Wrong value: " + id);
    }
}