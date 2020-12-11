package gift.factory;

import gift.UserInteraction;
import gift.box.Box;

public class BoxFactory {
    private final UserInteraction userInteraction;

    public BoxFactory(UserInteraction userInteraction) {
        this.userInteraction = userInteraction;
    }

    public BoxFactory() {
        this(new UserInteraction());
    }

    public Box createBox() {
        int type = userInteraction.requestInt("Type #");
        String color = userInteraction.requestString("color: ");
        String material = userInteraction.requestString("material: ");
        return new Box(type,color,material);
    }
}
