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

        int sweet = userInteraction.requestInt("Good day. please pick next sweet type: ");
        switch (sweet) {
            case 1 -> {
                int typeSugary = userInteraction.requestInt(types(Sugary.values()) + "Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Sugary(typeSugary), amount);
            }
            case 2 -> {
                int typeFlour = userInteraction.requestInt(types(Flour.values()) + "Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Flour(typeFlour), amount);
            }
            case 3 -> {
                int typeChocolate = userInteraction.requestInt(types(Chocolate.values()) + "Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Chocolate(typeChocolate), amount);
            }
            case 4 -> {
                int typeCacao = userInteraction.requestInt(types(Cacao.values()) + "Please choose type: ");
                int amount = userInteraction.requestInt("Amount: ");
                return new Sweet(new Cacao(typeCacao), amount);
            }
        }
        throw new IllegalArgumentException("Wrong value.");
    }

    private String types(GetSweetType [] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(i+1).append(". ").append(arr[i].getTxt()).append("\n");
        }
        return sb.toString();
    }
}
