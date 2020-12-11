package gift;

import gift.box.Box;
import gift.sweets.Sweet;

public class Gift {
    private final Sweet sweet;
    private final Box box;

    public Gift(Sweet sweet, Box box) {
        this.sweet = sweet;
        this.box = box;
    }

    @Override
    public String toString() {
        return "Gift: " + "\t" + sweet + "\n\t\t" + box;
    }
}
