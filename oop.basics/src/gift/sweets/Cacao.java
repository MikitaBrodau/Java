package gift.sweets;

import java.util.StringJoiner;

public class Cacao extends Pastry {
    private final CacaoType cacaoType;

    public Cacao(int cacaoTypeId) {
        System.out.println();
        this.cacaoType = CacaoType.valueOf(cacaoTypeId);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cacao.class.getSimpleName() + "[", "]")
                .add("id: " + cacaoType.getId()).add("type: " + cacaoType.getTxt()).toString();
    }

    public static void getTypes() {
        for (CacaoType c : CacaoType.values()) {
            System.out.println(c.toString());
        }
    }
}

enum CacaoType {
    Butter(1, "butter"), Beans(2, "Beans"), POWDER(3, "Powder");
    private final int id;
    private final String txt;

    public int getId() {
        return id;
    }

    public String getTxt() {
        return txt;
    }

    CacaoType(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public static CacaoType valueOf(int id) {
        for (CacaoType c : CacaoType.values()) {
            if (id == c.id) return c;
        }
        throw new IllegalArgumentException("Wrong value: " + id);
    }
}