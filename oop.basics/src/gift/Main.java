package gift;

import gift.box.Box;
import gift.factory.BoxFactory;
import gift.factory.SweetFactory;
import gift.sweets.Sweet;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        SweetFactory sweetFactory = new SweetFactory(ui);
        BoxFactory boxFactory = new BoxFactory(ui);

        List<Gift> gifts = new ArrayList<>();

        while (true) {
            if (ui.requestContinue("Do you want continue?\"Y/N\"")) break;
            Sweet sweet = sweetFactory.createSweet();
            Box box = boxFactory.createBox();
            gifts.add(new Gift(sweet, box));
        }
        gifts.forEach(Gift -> System.out.println("Gift = " + Gift));
    }
}
