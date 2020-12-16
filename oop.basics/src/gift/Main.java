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
            Sweet sweet = sweetFactory.createSweet();
            Box box = boxFactory.createBox();
            gifts.add(new Gift(sweet, box));
            if (ui.requestContinue("Do you want continue?\"Y/N\"")) break;
        }
        gifts.forEach(Gift -> System.out.println("Gift = " + Gift));
    }
}
