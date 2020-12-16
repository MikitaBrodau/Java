package gift.factory;

import gift.UserInteraction;
import gift.box.Box;
import gift.sweets.GetSweetType;

public class BoxFactory {
    private final UserInteraction userInteraction;

    public BoxFactory(UserInteraction userInteraction) {
        this.userInteraction = userInteraction;
    }

    public BoxFactory() {
        this(new UserInteraction());
    }

    public Box createBox() {
        int type = userInteraction.requestInt(types(Box.values()) + "Choose one: ");
        String color = userInteraction.requestString("Write using color: ");
        String material = userInteraction.requestString("Write using material: ");
        return new Box(type, color, material);
    }

    private String types(Box.BoxType[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(i + 1).append(". ").append(arr[i].getTxt()).append("\n");
        }
        return sb.toString();
    }
    private int typesValidation(Box.BoxType[] arr){
        int type = userInteraction.requestInt(types(arr) + "Please choose type: ");
        if (type <= arr.length) return type;
        else return typesValidation(arr);
    }
}
