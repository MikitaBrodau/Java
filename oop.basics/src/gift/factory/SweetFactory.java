package gift.factory;

import gift.UserInteraction;
import gift.sweets.*;

public class SweetFactory {
    private final UserInteraction userInteraction;

    public SweetFactory(UserInteraction userInteraction) {
        this.userInteraction = userInteraction;
    }

    public SweetFactory() {
        userInteraction = new UserInteraction();
    }

    public Sweet createSweet() {
        System.out.println("#1" + "\tSugary.");
        System.out.println("#2" + "\tFlour.");
        System.out.println("#3" + "\tChocolate.");
        System.out.println("#3" + "\tCacao.");
        int sweet = userInteraction.requestInt("Good day. please pick next sweet type: ");
        switch (sweet) {
            case 1 -> {
                Sugary.getTypes();
                int typeSugary = userInteraction.requestInt("Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Sugary(typeSugary), amount);
            }
            case 2 -> {
                Flour.getTypes();
                int typeFlour = userInteraction.requestInt("Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Flour(typeFlour), amount);
            }
            case 3 -> {
                Chocolate.getTypes();
                int typeChocolate = userInteraction.requestInt("Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Chocolate(typeChocolate), amount);
            }
            case 4 -> {
                Cacao.getTypes();
                int typeCacao = userInteraction.requestInt("Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Cacao(typeCacao), amount);
            }
        }
        throw new IllegalArgumentException("Wrong value.");
    }
}
