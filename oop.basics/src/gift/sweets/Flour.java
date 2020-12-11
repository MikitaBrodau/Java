package gift.sweets;


import java.util.StringJoiner;

public class Flour extends Pastry {
    private final FlourType flourType;

    public Flour(int sugaryTypeId) {
        System.out.println();
        this.flourType = FlourType.valueOf(sugaryTypeId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flour.class.getSimpleName() + "[", "]")
                .add("id: " + flourType.getId()).add("type: " + flourType.getTxt()).toString();
    }

    public static void getTypes() {
        for (FlourType f : FlourType.values()) {
            System.out.println(f.toString());
        }
    }
}

enum FlourType {
    WAFFLE(1, "Waffle"), COOKIE(2, "Cookie"), PIE(3, "Pie"), DONUTS(4, "Donuts"),
    ECLAIR(5, "Pastries"), CHEESECAKE(6, "Cheesecake"), MUFFIN(7, "Muffin");
    private final int id;
    private final String txt;

    public int getId() {
        return id;
    }

    public String getTxt() {
        return txt;
    }

    FlourType(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public static FlourType valueOf(int id) {
        for (FlourType f : FlourType.values()) {
            if (id == f.id) return f;
        }
        throw new IllegalArgumentException("Wrong value: " + id);
    }
}