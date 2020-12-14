package gift.sweets;

import java.util.StringJoiner;

public class Sugary extends Pastry {
    private final SugaryType sugaryType;

    public Sugary(int sugaryTypeId) {
        System.out.println();
        this.sugaryType = SugaryType.valueOf(sugaryTypeId);
    }

    public static SugaryType[] values() {
        return SugaryType.values();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sugary.class.getSimpleName() + "[", "]")
                .add("id: " + sugaryType.getId()).add("type: " + sugaryType.getTxt()).toString();
    }

    enum SugaryType implements GetSweetType {
        JELLY(1, "Jelly"), CAKE(2, "Cake"), PIE(3, "Pie"), CUPCAKES(4, "Cupcakes"),
        PASTRIES(5, "Pastries"), IRIS(6, "Iris"), ZEPHYR(7, "Zephyr"), CANDY(8, "Candy");
        private final int id;
        private final String txt;

        SugaryType(int id, String txt) {
            this.id = id;
            this.txt = txt;
        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public String getTxt() {
            return txt;
        }

        public static SugaryType valueOf(int id) {
            for (SugaryType s : SugaryType.values()) {
                if (id == s.id) return s;
            }
            throw new IllegalArgumentException("Wrong value: " + id);
        }
    }
}


