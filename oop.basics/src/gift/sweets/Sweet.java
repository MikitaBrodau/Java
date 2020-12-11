package gift.sweets;

import java.util.StringJoiner;

public class Sweet {
    Pastry pastry;
    int amount;


    public Sweet(Pastry pastry, int amount) {
        this.pastry = pastry;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return new StringJoiner("", Sweet.class.getSimpleName() + ":", ".")
                .add("\t" + pastry.toString()).add("\tamount: " + amount).toString();
    }
}
